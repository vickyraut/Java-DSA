public class QueueusingLL {
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static class Queue {
        static Node head = null;
        static Node tail = null;

        public static boolean isEmpty() {
            return head == null && tail == null;
        }


        // Add
        public static void add(int data) { // TC = o(1)
            Node newNode = new Node(data);

            if (head == null){
                head = tail = newNode;
                return;
            }

            tail.next = newNode;
            tail = newNode;
        }


        // Remove
        public static int remove() { // TC = o(n)
            if (isEmpty()) {
                System.out.println("Queue is Empty!");
            }

            int front = head.data;

            if (tail == head){
                head = tail =null;
            }else {
                head = head.next;
            }

            return front;
        }


        // Peek
        public static int peek() { // TC = o(1)
            if (isEmpty()) {
                System.out.println("Queue is Empty!");
            }

            return head.data;
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
    }
}
