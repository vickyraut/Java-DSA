public class Pairs_Array {

    public static void array_pair(int[] Array) {
        int Total_pair = 0;

        for (int i = 0; i < Array.length; i++) {
            for (int j = i + 1; j < Array.length; j++) {
                System.out.print("(" + Array[i] + "," + Array[j] + ") ");
                Total_pair++;
            }
            System.out.println();
        }

        System.out.println("Total pair: "+Total_pair);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        array_pair(arr);
    }
}