public class Array_Backtracking {
    public static void arr_backtrack(int[] arr, int i, int val){
        //base
        if (i == arr.length){
            printArr(arr);
            return;
        }
        
        //recursion
        arr[i] = val;
        arr_backtrack(arr, i+1, val+1);
        //backtrack
        arr[i] = val-2;
    }

    private static void printArr(int[] arr) {
        for(int i : arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = new int[5];
        arr_backtrack(arr, 0, 1);
        printArr(arr);
    }
}
