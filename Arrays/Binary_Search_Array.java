public class Binary_Search_Array {

    public static int binary_search_array(int[] array, int key) {
        int start = 0;
        int end = array.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (array[mid] == key) {
                return mid;
            } else if (array[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 7, 12, 45, 60, 75, 99, 100};
        int key = 45;

        System.out.println(binary_search_array(arr, key));
    }
}
