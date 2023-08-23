import java.util.Arrays;

public class Reverse_Spiral_Matrix {

    public static int[] reverse_spiral_matrix(int[][] array) {
        int start_row = 0;
        int start_col = 0;
        int end_row = array.length - 1;
        int end_col = array[0].length - 1;

        int[] reversed_array = new int[(array.length * array[0].length)];
        int r_index = reversed_array.length - 1;

        while (start_row <= end_row && start_col <= end_col) {
            // Top
            for (int j = start_col; j <= end_col; j++) {
                reversed_array[r_index--] = array[start_row][j];
            }

            // right
            for (int i = start_row + 1; i <= end_row; i++) {
                reversed_array[r_index--] = array[i][end_col];
            }

            // bottom
            for (int j = end_col - 1; j >= start_col; j--) {

                // This is condition is for odd*Even Matrix
                // Without this condition last element get printed twice
                if (start_row == end_row) {
                    break;
                }
                reversed_array[r_index--] = array[end_row][j];
            }

            // left
            for (int i = end_row - 1; i >= start_row + 1; i--) {

                // This is condition is for Even*Odd Matrix
                // Without this condition last element get printed twice
                if (start_col == end_col) {
                    break;
                }
                reversed_array[r_index--] = array[i][start_col];
            }

            // Upper code is for boundary conditions
            // thi is to go inside the matrix
            start_row++;
            start_col++;
            end_row--;
            end_col--;
        }


        return reversed_array;
    }

    public static void main(String[] args) {

        int[][] arr = {{1, 2, 3, 4},
                {12, 13, 14, 5},
                {11, 16, 15, 6},
                {10, 9, 8, 7}};

        System.out.println(Arrays.toString(reverse_spiral_matrix(arr)));

    }
}
