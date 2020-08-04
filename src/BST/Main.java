package BST;

public class Main {

    //     5
    //  3     6
    //2   4      8
    public static void main(String[] args) {
        BST<Integer> bst = new BST<Integer>();
        int[] nums = {5,3,6,8,4,2};
        for (int num : nums) {
            bst.add(num);
        }
        bst.preOrder();
//        System.out.print(bst);
        System.out.println();
        bst.preOrderNR();
//        System.out.println(bst.toString());
//        System.out.println();
//        bst.inOrder();
//        System.out.println();
//        bst.postOrder();

    }
}
