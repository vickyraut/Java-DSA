public class LinkedList2 {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public static Node head;
    public static Node tail;

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

    public boolean iscycle() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }

    public void removeCycle() {
        Node slow = head;
        Node fast = head;
        boolean isCycle = false;
        Node prev = null;

        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                isCycle = true;
                break;
            }
        }

        if (isCycle == false) {
            return;
        }

        // this is for spacial case is slow and fast meats on head (slow == fast ==
        // head)
        if (slow == head) {
            prev.next = null;
        }

        prev = null;
        slow = head;
        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        prev.next = null;
    }

    // get mid function
    private Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public Node merge(Node head1, Node head2) {
        Node mergeLL = new Node(-1);
        Node temp = mergeLL;

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }

        // Adding remaining element to sorted linedList
        // for head1 LinkedList
        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }

        // for head2 LinkedList
        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }

        return mergeLL.next; // Cause we don't want to add linkedList's first element that is "-1"
    }

    public Node mergeSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        // find mid
        Node midNode = getMid(head);
        Node rightNode = midNode.next;
        midNode.next = null;

        Node leftHalf = mergeSort(head);
        Node rightHalf = mergeSort(rightNode);

        // merge
        return merge(leftHalf, rightHalf);
    }

    public static void main(String[] args) {
        head = new Node(5);
        head.next = new Node(4);
        head.next.next = new Node(3);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(1);

        LinkedList2 ll = new LinkedList2();
        ll.printList();
        head = ll.mergeSort(head);
        ll.printList();
    }
}
