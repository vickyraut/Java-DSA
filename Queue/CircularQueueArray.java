import java.util.Objects;

public class CircularQueueArray {
    public static class Queue {
        static int[] arr;
        static int size;
        static int front;
        static int rear;

        public Queue(int n) {
            arr = new int[n];
            size = n;
            front = -1;
            rear = -1;
        }

        public static boolean isEmpty() {
            return (front == -1 && rear == -1);
        }

        public static boolean isFull() {
            return ((rear + 1) % size == front);
        }

        public static void add(int data) { // TC = o(1)
            if (isFull()) {
                System.out.println("Queue is Full!");
                return;
            }

            // For first element in empty queue
            if (front == -1) {
                front = 0;
            }

            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        public static int remove() { // TC = o(1)
            if (isEmpty()) {
                System.out.println("Queue is Empty!");
            }

            int result = arr[front];
            if (front == rear) {
                front = -1;
                rear = -1;
            } else {
                front = (front + 1) % size;
            }
            return result;
        }


        // Peek
        public static int peek() { // TC = o(1)
            if (isEmpty()) {
                System.out.println("Queue is Empty!");
            }

            return arr[front];
        }
    }

    public static void main(String[] args) {
        Queue queue = new Queue(3);

        queue.add(1);
        queue.add(2);
        queue.add(3);

        // To check circular queue conditions
        System.out.println(queue.remove());
        queue.add(4);
        System.out.println(queue.remove());
        queue.add(5);

        while (!queue.isEmpty()) {
            System.out.println(queue.peek());
            queue.remove();
        }
    }
}
