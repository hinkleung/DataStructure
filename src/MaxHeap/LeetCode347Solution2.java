package MaxHeap;

import java.util.*;
import java.util.PriorityQueue;

/**
 * 使用java标准库中的优先队列
 */
public class LeetCode347Solution2 {

    private class Freq {
        int e, freq;
        public Freq(int e, int freq) {
            this.e = e;
            this.freq = freq;
        }
    }

    private class FreqComparator implements Comparator<Freq>{
        @Override
        public int compare(Freq a, Freq b) {
            return a.freq-b.freq;
        }
    }

    public List<Integer> topKFrequent(int[] nums, int k) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        PriorityQueue<Freq> pq = new PriorityQueue<Freq>(new FreqComparator());
        for (int key : map.keySet()) {
            if (pq.size() < k) {
                pq.add(new Freq(key, map.get(key)));
            } else if (map.get(key) > pq.peek().freq) {
                pq.remove();
                pq.add(new Freq(key, map.get(key)));
            }
        }
        LinkedList<Integer> res = new LinkedList<Integer>();
        while(!pq.isEmpty()){
            res.add(pq.remove().e);
        }
        return res;
    }
}
