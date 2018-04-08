import java.util.Deque;
import java.util.LinkedList;

public class TestStack {

    public static void main(String[] args) {
        Deque<Integer> queue = new LinkedList<Integer>();
        queue.offerFirst(10);
        queue.offerFirst(100);
        queue.offerFirst(-1);

        while(!queue.isEmpty()) {
            System.out.println(queue.pollFirst());
        }

    }
}
