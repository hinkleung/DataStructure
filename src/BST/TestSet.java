package BST;

import LinkedList.LinkedListSet;

import java.util.ArrayList;

public class TestSet {

    private static double testSet(Set<String> set, String filename){
        long start = System.nanoTime();
        ArrayList<String> words = new ArrayList<>();
        if(FileOperation.readFile(filename, words)) {
            System.out.println("Total words: " + words.size());
            for (String word : words) {
                set.add(word);
            }
        }
        long end = System.nanoTime();
        System.out.println("Total different words: " + set.getSize());
        return (end-start)/1000000000.0;
    }

    public static void main(String[] args) {
        String filename = "src/BST/pride-and-prejudice.txt";
        BSTSet<String> bstSet = new BSTSet<String>();
        double time1 = testSet(bstSet, filename);
        System.out.println("BST SET: " + time1 +"s");
        LinkedListSet<String> linkedListSet = new LinkedListSet<String>();
        double time2 = testSet(linkedListSet, filename);
        System.out.println("LinkedListSet SET: " + time2 +"s");

    }


}
