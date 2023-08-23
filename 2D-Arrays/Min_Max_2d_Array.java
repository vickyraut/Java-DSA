import java.util.Scanner;

public class Min_Max_2d_Array {

    public static int max_array(int[][] array) {
        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                largest = Math.max(largest, array[i][j]);
            }
        }

        return largest;
    }

    public static int min_array(int[][] array) {
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                smallest = Math.min(smallest, array[i][j]);
            }
        }

        return smallest;
    }

    public static void main(String[] args) {
        int[][] array = new int[3][3];

        //input
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        System.out.println(max_array(array));
        System.out.println(min_array(array));
    }
}