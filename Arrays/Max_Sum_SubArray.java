public class Max_Sum_SubArray {

    public static void Subarray(int[] Array) {
        int Total_Subarray = 0;
        int Max_Sum = Integer.MIN_VALUE;

        for (int i = 0; i < Array.length; i++) {

            for (int j = i; j < Array.length; j++) {
                int sum = 0;

                for (int k = i; k <= j; k++) {
                    sum = sum + Array[k];
                }
                if (sum > Max_Sum) {
                    Max_Sum = sum;
                }
                System.out.println("SUM: " + sum);
                Total_Subarray++;
            }
        }
        System.out.println("Total SubArrays: " + Total_Subarray);
        System.out.print("Maximum Sum of an array: " + Max_Sum);
    }

    public static void main(String[] args) {
        int[] arr = {1, -2, 6, -1, 3};
        Subarray(arr);
    }
}