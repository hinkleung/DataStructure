package BST;

import java.util.ArrayList;

public class BSTSetMain {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        ArrayList<String> words1 = new ArrayList<>();
        if(FileOperation.readFile("src/BST/pride-and-prejudice.txt",words1)) {
            System.out.println("Total words: " + words1.size());
            BSTSet<String> set1 = new BSTSet<String>();
            for (String word : words1) {
                set1.add(word);
            }
            long end = System.currentTimeMillis();
            System.out.println("Total different words: " + set1.getSize());
            System.out.println("耗费时间： " + (end-start)/1000.0);
        }
    }
}
