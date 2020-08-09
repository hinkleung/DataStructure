package LinkedList;

import BST.BSTSet;
import BST.FileOperation;
import BST.Set;

import java.util.ArrayList;

public class LinkedListSet<E> implements Set<E> {

    private LinkedList<E> list;

    public LinkedListSet() {
        this.list = new LinkedList<E>();
    }

    @Override
    public void add(E e) {
        if(!list.contains(e)){
            list.addFirst(e);
        }
    }

    @Override
    public boolean contains(E e) {
        return list.contains(e);
    }

    @Override
    public void remove(E e) {
        list.removeElement(e);
    }

    @Override
    public int getSize() {
        return list.getSize();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        ArrayList<String> words1 = new ArrayList<>();
        if(FileOperation.readFile("src/BST/pride-and-prejudice.txt",words1)) {
            System.out.println("Total words: " + words1.size());
            LinkedListSet<String> set1 = new LinkedListSet<String>();
            for (String word : words1) {
                set1.add(word);
            }
            long end = System.currentTimeMillis();
            System.out.println("Total different words: " + set1.getSize());
            System.out.println("耗费时间： " + (end-start)/1000);
        }

    }
}
