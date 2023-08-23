public class Descending_Sorting {
    public static void bubble_descending(int[] array) {
        for (int i = 1; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] < array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        for (int k : array) {
            System.out.print(k + " ");
        }
    }

    public static void selection_sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int max_pos = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] > array[max_pos]) {
                    max_pos = j;
                }

                //swap
                int temp = array[max_pos];
                array[max_pos] = array[i];
                array[i] = temp;
            }
        }

        for (int k : array) {
            System.out.print(k + " ");
        }
    }

    public static void insertion_sort(int[] array) {

        for (int i = 1; i < array.length; i++) {
            int curr = array[i];
            int prev = i - 1;

            while (prev >= 0 && array[prev] < curr) {
                array[prev + 1] = array[prev];
                prev--;
            }

            // insertion
            array[prev + 1] = curr;
        }

        for (int k : array) {
            System.out.print(k + " ");
        }
    }

    public static void counting_sort(int[] array) {
        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            largest = Math.max(largest, array[i]);
        }

        int[] count = new int[largest + 1];
        for (int j = 0; j < array.length; j++) {
            count[array[j]]++;
        }

        // sorting
        int j = array.length - 1;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                array[j] = i;
                count[i]--;
                j--;
            }
        }

        for (int k : array) {
            System.out.print(k + " ");
        }
    }


    public static void main(String[] args) {
        int[] arr = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};

        System.out.println("I am Bubble Sort: ");
        bubble_descending(arr);
        System.out.println();

        System.out.println("I am Selection Sort: ");
        selection_sort(arr);
        System.out.println();

        System.out.println("I am Insertion Sort: ");
        insertion_sort(arr);
        System.out.println();

        System.out.println("I am Counting Sort: ");
        counting_sort(arr);
        System.out.println();
    }
}