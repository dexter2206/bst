import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class BinarySearchTree {

    private Node root;

    public BinarySearchTree() {

    }

    public boolean add(int i){
        if(root == null) {
            root = new Node(i);
            return true;
        }

        Node current = root;
        while(current.getValue() != i) {
            if(current.getValue() > i) {
                if(current.getLeft() == null) {
                    current.setLeft(new Node(i));
                    return true;
                } else {
                    current = current.getLeft();
                }
            } else {
                // current.getValue() < i
                if(current.getRight() == null) {
                    current.setRight(new Node(i));
                    return true;
                } else {
                    current = current.getRight();
                }
            }
        }
        return false;
    }

    public boolean contains(int i) {
        if(root == null) {
            return false;
        }

        Node current = root;

        while(current.getValue() != i) {
            if(current.getValue() > i) {
                if(current.getLeft() == null) {
                    return false;
                } else {
                    current = current.getLeft();
                }
            } else {
                // current.getValue() < i
                if(current.getRight() == null) {
                    return false;
                } else {
                    current = current.getRight();
                }
            }
        }
        return true;
    }

    public List<Integer> toList() {
        List<Integer> result = new LinkedList<>();
        Deque<Node> stack = new LinkedList<>();

        if(root == null) {
            return result;
        }

        Node current = root;
        while(current != null) {
            stack.offerFirst(current);
            current = current.getLeft();
        }
        while(!stack.isEmpty()) {
            current = stack.pollFirst();
            result.add(current.getValue());
            if(current.getRight() != null) {
                current = current.getRight();
                while(current != null) {
                    stack.offerFirst(current);
                    current = current.getLeft();
                }
            }
        }
        return result;
    }
}
