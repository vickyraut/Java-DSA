<<<<<<< HEAD
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
=======
public class temp {
    public static void printarr(int[] arr){
        for(int i : arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        printarr(arr);

        for(int i = 0; i<arr.length-1; i++){
            for(int j = i+1; j<arr.length; j++){
                System.out.print("(" + arr[i]+ "," +arr[j]+ ")");
            }
            System.out.println();
        }
    }
}
>>>>>>> 2dc2d2a15ea84cd77e87a7988cdb28723bf345e5
