public class Subarray_Array {

    public static void Subarray(int[] Array) {
        int Total_Subarray = 0;

        for (int i = 0; i < Array.length; i++) {

            for (int j = i; j < Array.length; j++) {

                for (int k = i; k <= j; k++) {
                    System.out.print(Array[k]);
                }
                Total_Subarray++;
                System.out.println();

            }
            System.out.println();
        }
        System.out.println("Total SubArrays: " + Total_Subarray);
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        Subarray(arr);
    }
}