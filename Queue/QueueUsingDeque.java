import java.util.Deque;
import java.util.LinkedList;

public class QueueUsingDeque {
    static class Queue {
        Deque<Integer> deque = new LinkedList<>();

        public void add(int data) {
            deque.addLast(data);
        }

        public int remove() {
            return deque.removeFirst();
        }

        public int peek() {
            return deque.getFirst();
        }
    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.add(10);
        queue.add(20);
        System.out.println("Queue peek: " + queue.peek()); // Output: 10
        System.out.println("Queue remove: " + queue.remove()); // Output: 10
        System.out.println("Queue remove: " + queue.remove()); // Output: 20
    }
}
