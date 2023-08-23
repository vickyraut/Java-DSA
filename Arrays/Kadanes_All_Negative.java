public class Kadanes_All_Negative {

    public static void kadane_negative(int[] Array) {
        int Max_Sum = Integer.MIN_VALUE;
        int Current_Sum = 0;

        for (int i = 0; i < Array.length; i++) {
            if (Current_Sum < 0) {
                Current_Sum = Array[i];
            } else {
                Current_Sum += Array[i];
            }

            Max_Sum = Math.max(Max_Sum, Current_Sum);
        }

        System.out.println(Max_Sum);
    }

    public static void main(String[] args) {
        int[] arr = {-2, -1, -5, -4, -2};

        kadane_negative(arr);
    }
}
