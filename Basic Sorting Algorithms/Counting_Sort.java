public class Counting_Sort {

    public static void counting_sort(int[] array){
        int largest = Integer.MIN_VALUE;

        // Finding largest
        for (int i = 0; i<array.length; i++){
            largest = Math.max(largest, array[i]);
        }

        // count array
        int[] count = new int[largest+1];
        for (int i = 0; i<array.length; i++){
            count[array[i]]++;
        }

        //sorting
        int j = 0;
        for (int i = 0; i<count.length; i++){
            while (count[i]>0) {
                array[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 4, 1, 3, 2};

        counting_sort(arr);

        for (int k : arr){
            System.out.print(k+" ");
        }
    }
}
