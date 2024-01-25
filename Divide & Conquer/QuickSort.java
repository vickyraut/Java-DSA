<<<<<<< HEAD
public class QuickSort {
    public static void print_arr(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    public static void quickSort(int[] arr, int si, int ei){
        // base case
        if (si >= ei){
            return;
        }

        // To get pivot index
        int pivot_index = partition(arr, si, ei);

        // To swap left side of pivot index
        quickSort(arr, si, pivot_index-1);

        // To swap right side of pivot index
        quickSort(arr, pivot_index, ei);
    }

    public static int partition(int[] arr, int si, int ei){
        int pivot = arr[ei];
        int index = si-1;

        for (int i = si; i < ei; i++) {
            if(arr[i] <= pivot){
                // swap
                index++;
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
            }
        }
        // To swap pivot number to it's position
        index++;
        int temp = arr[ei];
        arr[ei] = arr[index];
        arr[index] = temp;

        return index;
    }

    public static void main(String[] args) {
        int[] arr = {6, 3, 9, 8, 2, 5};
        quickSort(arr, 0, arr.length-1);
        print_arr(arr);
    }
}
=======
public class QuickSort {
    public static void print_arr(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    public static void quickSort(int[] arr, int si, int ei){
        // base case
        if (si >= ei){
            return;
        }

        // To get pivot index
        int pivot_index = partition(arr, si, ei);

        // To swap left side of pivot index
        quickSort(arr, si, pivot_index-1);

        // To swap right side of pivot index
        quickSort(arr, pivot_index, ei);
    }

    public static int partition(int[] arr, int si, int ei){
        int pivot = arr[ei];
        int index = si-1;

        for (int i = si; i < ei; i++) {
            if(arr[i] <= pivot){
                // swap
                index++;
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
            }
        }
        // To swap pivot number to it's position
        index++;
        int temp = arr[ei];
        arr[ei] = arr[index];
        arr[index] = temp;

        return index;
    }

    public static void main(String[] args) {
        int[] arr = {6, 3, 9, 8, 2, 5};
        quickSort(arr, 0, arr.length-1);
        print_arr(arr);
    }
}
>>>>>>> 2dc2d2a15ea84cd77e87a7988cdb28723bf345e5
