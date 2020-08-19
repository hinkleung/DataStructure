package MaxHeap;

import Queue.Queue;

/**
 * 优先队列
 */
public class PriorityQueue<E extends Comparable<E>> implements Queue<E> {

    private MaxHeap<E> maxHeap;

    public PriorityQueue(){
        maxHeap = new MaxHeap<E>();
    }

    @Override
    public int getSize() {
        return maxHeap.size();
    }

    @Override
    public boolean isEmpty() {
        return maxHeap.isEmpty();
    }

    @Override
    public E getFront() {
        return maxHeap.findMax();
    }

    @Override
    public E dequeue() {
        return maxHeap.extractMax();
    }

    @Override
    public void enqueue(E e) {
        maxHeap.add(e);
    }
}
