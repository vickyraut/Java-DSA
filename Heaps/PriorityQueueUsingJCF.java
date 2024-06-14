import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueUsingJCF {
    public static void main(String[] args) {
//        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(); // Ascending
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Comparator.reverseOrder()); // descending

        priorityQueue.add(3);
        priorityQueue.add(4);
        priorityQueue.add(1);
        priorityQueue.add(7);

        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.peek());
            priorityQueue.remove();
        }
    }
}
