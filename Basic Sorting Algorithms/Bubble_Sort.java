public class Bubble_Sort {
    public static void bubble_sort(int[] array) {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {

                // Check greater number
                if (array[j] > array[j + 1]) {

                    // swap
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        printarr(array);
    }

    public static void printarr(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 4, 1, 3, 2};

        bubble_sort(arr);

    }
}
