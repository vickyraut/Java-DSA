public class temp {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public static void main(String[] args) {
        temp t = new temp();
        head = new Node(1);
        head.next = new Node(2);
    }
}
