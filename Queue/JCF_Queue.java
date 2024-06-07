import java.util.*;

public class JCF_Queue {
    public static void main(String[] args) {
//        Queue<Integer> queue = new LinkedList<>(); // LinkedList
        Queue<Integer> queue = new ArrayDeque<>(); // ArrayDeque
        queue.add(1);
        queue.add(2);
        queue.add(3);

        while (!queue.isEmpty()) {
            System.out.println(queue.peek());
            queue.remove();
        }
    }
}
