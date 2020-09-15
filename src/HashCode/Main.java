package HashCode;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        int a = 42;
        System.out.println(((Integer)a).hashCode());

        Integer b = 42;
        System.out.println(b.hashCode());

        Integer c = new Integer(42);
        System.out.println(c.hashCode());

        Student student1 = new Student(3,2,"BOBO","123");
        Student student2 = new Student(3,2,"bobo","123");
        System.out.println(student1);
        System.out.println(student2);

        HashMap<Student,Integer> map = new HashMap<>();
        map.put(student1,1);
        map.put(student2,2);
        System.out.println(map.get(student1));;

    }
}
