import java.util.Arrays;
import java.util.Scanner;

public class Array_sort {
    public static void input_array(int[] array) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
    }

    public static void output_array(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    public static void sort_array(int[] array) {
        Arrays.sort(array);
    }

    public static void main(String[] args) {
        int[] random_arr = new int[5];

        System.out.println("Enter any 5 numbers to sort : ");
        input_array(random_arr);

        System.out.println("Entered numbers to sort : ");
        output_array(random_arr);

        System.out.println();// new line

        sort_array(random_arr);

        System.out.println("Sorted array: ");
        output_array(random_arr);

    }
}
