import java.util.Stack;

public class QueueUsing_2stack {
    public static class Queue {
        static Stack<Integer> stack1 = new Stack<>();
        static Stack<Integer> stack2 = new Stack<>();

        public static boolean isEmpty() {
            return stack1.isEmpty();
        }

        public static void add(int data) {
            // make stack one empty by transferring elements to stack 2
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }

            // push data in stack 1
            stack1.push(data);

            // Get all the elements back in stack 1
            while (!stack2.isEmpty()) {
                stack1.push(stack2.pop());
            }
        }

        public static int remove() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }

            return stack1.pop();
        }

        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }

            return stack1.peek();
        }
    }

    public static void main(String[] args) {
        Queue queue = new Queue();

        queue.add(1);
        queue.add(2);
        queue.add(3);

        while (!queue.isEmpty()) {
            System.out.println(queue.peek());
            queue.remove();
        }

        queue.remove();
    }
}
