import java.util.Arrays;

public class TripletSum {

    // My Logic
    public static void triplet_array(int[] array){
        for (int i = 0; i < array.length-2; i++) {
            for (int j = i+1; j < array.length-1; j++) {
                int k = j+1;

                if((i!=j && i!= k && j!= k) && array[i] + array[j] +array[k] == 0){
                    System.out.println("["+ array[i]+","+ array[j]+","+ array[k] +"]");
                }
            }
        }
    }

    //Optimised Logic using (Two Pointers Algorithms)

    public static boolean triplet_array2(int[] array){
        for (int i = 0; i< array.length-2; i++){
            Arrays.sort(array); // Sort the array
            if (twoSum(array, -array[i], i+1) == true){
                return true;
            };
        }
        return false;
    }

    public static boolean twoSum(int[] arr, int target, int left){
        int right = arr.length-1;

        while (left<right){
            if(arr[left]+arr[right]<target){
                left++;
            }else if(arr[left]+arr[right]>target){
                right--;
            } else {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, -1, -4};
        boolean result = triplet_array2(arr);
        System.out.println("Triplet sum exists: " + result);
    }
}
