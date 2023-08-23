public class Kadanes_Algorithm {
    public static void kadane(int[] Array) {
        int Max_Sum = Integer.MIN_VALUE;
        int Current_Sum = 0;

        for (int i = 0; i < Array.length; i++) {
            Current_Sum += Array[i];

            if (Current_Sum < 0) {
                Current_Sum = 0;
            }

            Max_Sum = Math.max(Max_Sum, Current_Sum);
        }
        System.out.println("Max Sum : " + Max_Sum);
    }

    public static void main(String[] args) {
        int[] arr = {-1, -2, 6, -1, 3};

        kadane(arr);
    }
}
