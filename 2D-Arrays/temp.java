public class temp {

    public static int MaxSubarrySum(int[] arr) {
        int ms = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0; i<arr.length; i++){
            if (sum < 0) {
                sum = 0;
            }else{
                sum += arr[i];
            }
            ms = Math.max(sum, ms);
        }

        return ms;
    }

    public static void printarr(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { -1, -2, 6, -1, 3 };
        printarr(arr);
        System.out.println(MaxSubarrySum(arr));
    }
}
