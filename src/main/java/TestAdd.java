public class TestAdd {

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        bst.add(1);
        bst.add(0);
        bst.add(5);
        bst.add(5);
        bst.add(2);
        bst.add(6);
        bst.add(-3);
        bst.add(10);
        System.out.println(bst.contains(2));
        System.out.println(bst.contains(-1));
        System.out.println(bst.toList());
    }
}
