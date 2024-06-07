public class QueueUsingArray {
    public static class Queue {
        static int[] arr;
        static int size;
        static int rear;

        public Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
        }

        public static boolean isEmpty() {
            return rear == -1;
        }


        // Add
        public static void add(int data) { // TC = o(1)
            if (rear == size - 1) {
                System.out.println("Queue is Full!");
                return;
            }

            rear++;
            arr[rear] = data;
        }


        // Remove
        public static int remove() { // TC = o(n)
            if (isEmpty()) {
                System.out.println("Queue is Empty!");
            }

            int front = arr[0];

            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }

            rear = rear - 1;
            return front;
        }


        // Peek
        public static int peek() { // TC = o(1)
            if (isEmpty()) {
                System.out.println("Queue is Empty!");
            }

            return arr[0];
        }
    }

    public static void main(String[] args) {
        Queue queue = new Queue(5);

        queue.add(1);
        queue.add(2);
        queue.add(3);

        while (!queue.isEmpty()) {
            System.out.println(queue.peek());
            queue.remove();
        }
    }
}
