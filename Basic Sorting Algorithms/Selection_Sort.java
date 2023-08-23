public class Selection_Sort {

    public static void selection_sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min_pos = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min_pos]) {
                    min_pos = j;
                }
            }

            //swap
            int temp = array[min_pos];
            array[min_pos] = array[i];
            array[i] = temp;
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

        selection_sort(arr);

    }
}
