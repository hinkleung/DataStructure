import Array.Array;

public class Main {

    public static void main(String[] args) {

        Array arr = new Array(20);
        for(int i=0;i<10;i++){
            arr.addLast(i);
        }

        arr.addLast(100);

        System.out.println(arr);

    }
}
