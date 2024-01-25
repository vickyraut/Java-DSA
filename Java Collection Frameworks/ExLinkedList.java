import java.util.LinkedList;
class ExLinkedList{
    public static void main(String args[]){
        LinkedList<Integer> ll = new LinkedList<>();

        ll.addFirst(1);
        ll.addLast(2);
        ll.addFirst(0);

        System.out.println(ll);
    }
}