public class LinkedList {
    private static int n;

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) { // TC = o(1)
        // Step 1 -> creating new Node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // Step 2 -> newNode next = head
        newNode.next = head;

        // Step 3 -> head = newNode
        head = newNode;
    }

    public void addLast(int data) { // TC = o(1)
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;

        tail = newNode;
    }

    public void addMiddle(int index, int data) {
        if (index == 0) {
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        while (i < index - 1) {
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst() {
        // if Linked list is Empty
        if (size == 0) {
            System.out.println("Linked List is Empty");
            return Integer.MIN_VALUE;
        }

        // if Linked List has only 1 element
        else if (size == 1) {
            int value = head.data;
            head = tail = null;
            size = 0;
            return value;
        }
        int value = head.data;
        head = head.next;
        size--;
        return value;
    }

    public int removeLast() {
        if (size == 0) {
            System.out.println("Linked List is Empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int value = head.data;
            head = tail = null;
            size = 0;
            return value;
        }

        // finding previous value to the tail node
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }

        // removing tail element
        int value = prev.next.data; // tails data
        prev.next = null;
        tail = prev;
        size--;
        return value;
    }

    public int iterative_Search(int key) {
        Node temp = head;
        int i = 0;

        while (temp.next != null) { // if key found
            if (temp.data == key) {
                return i;
            }

            temp = temp.next;
            i++;
        }

        // key not found;
        return -1;
    }

    public int helper(Node head, int key) {
        if (head == null) {
            return -1;
        }

        if (head.data == key) {
            return 0;
        }

        int idx = helper(head.next, key);

        if (idx == -1) {
            return -1;
        }

        return idx + 1;
    }

    public int recursiveSearch(int key) {
        return helper(head, key);
    }

    public void reverseList() {
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // Update head cause head now is NULL
        head = prev;
    }

    public void deleteNthFromEnd(int n) {
        // let's calculate size
        int sz = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            sz++;
        }

        // if user want to delete 1st Node
        if (n == sz) {
            assert head != null;
            head = head.next;
            return;
        }

        int nodeCount = 1;

        int nodeToFind = sz - n;
        Node prev = head;
        while (nodeCount < nodeToFind) {
            assert prev != null;
            prev = prev.next;
            nodeCount++;
        }

        assert prev != null;
        prev.next = prev.next.next;
    }

    public Node findMidNode(Node head){
        Node slow = head;
        Node fast = head;

        while (fast!= null && fast.next !=null){
            slow = slow.next;
            fast=fast.next.next;
        }

        return slow;
    }

    public boolean isPalindrome(){
        // if linked list is empty or contains only 1 node
        if (head == null || head.next == null){
            return true;
        }

        // find middle
        Node midNode = findMidNode(head);

        // reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;

        while (curr != null){
            next = curr.next;
            curr.next = prev;
            curr = next;
            prev = curr;
        }

        // check if equal
        Node right = prev;
        Node left =  head;

        while (right != null){
            if (left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }

        return true;
    }

    public void printList() { // TC = o(n)
        if (head == null) {
            System.out.println("Linked List is Empty..!");
        }
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.addFirst(2);
        ll.addFirst(1);

        ll.addLast(2);
        ll.addLast(1);

        ll.addMiddle(2, 3);
        ll.printList();

//        System.out.println(ll.iterative_Search(3));
//        System.out.println(ll.iterative_Search(10));
//
//        System.out.println(ll.recursiveSearch(3));
//        System.out.println(ll.recursiveSearch(10));
//
//        ll.removeFirst();
//        ll.printList();
//
//        ll.removeLast();
//        ll.printList();
//        System.out.println(size);

//        ll.printList();
//        ll.reverseList();
//        ll.printList();

//        ll.deleteNthFromEnd(n);
        ll.printList();
        System.out.println(ll.isPalindrome() );
    }
}
