public class Max_Sum_SubArray_Prefix {
    public static void SubArray_prefix(int[] Array) {
        int Total_Subarray = 0;
        int Max_Sum = Integer.MIN_VALUE;

        int[] prefix = new int[Array.length];
        prefix[0] = Array[0];
        for (int i = 1; i< prefix.length; i++){
            prefix[i] = prefix[i-1]+Array[i];
        }


        for (int i = 0; i<Array.length; i++){

            for (int j = i; j<Array.length; j++){

                int current_sum = i == 0 ? prefix[j]:prefix[j]-prefix[i-1];

                Total_Subarray++;

                if (current_sum > Max_Sum){
                    Max_Sum = current_sum;
                }
            }

        }

        System.out.println("Total SubArrays: " + Total_Subarray);
        System.out.print("Maximum Sum of an array: " + Max_Sum);
    }


    public static void main(String[] args) {
        int[] arr = {-1, -2, 6, -1, 3};
        SubArray_prefix(arr);
    }
}
