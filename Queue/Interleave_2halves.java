import java.util.LinkedList;
import java.util.Queue;

public class Interleave_2halves {
    public static void interleave2halves(Queue<Integer> queue) {
        int size = queue.size();
        Queue<Integer> firstHalf = new LinkedList<>();
        for (int i = 0; i < size / 2; i++) {
            firstHalf.add(queue.remove());
        }

        while (!firstHalf .isEmpty()) {
            queue.add(firstHalf.remove());
            queue.add(queue.remove());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= 10; i++) {
            queue.add(i);
        }

        interleave2halves(queue);

        while (!queue.isEmpty()) {
            System.out.print(queue.remove() + " ");
        }
    }
}
