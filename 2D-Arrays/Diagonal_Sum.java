public class Diagonal_Sum {

    public static int diagonal_sum(int[][] array) {
//        int sum = 0;
//        for (int i = 0; i<array.length; i++){
//            for (int j = 0; j<array.length; j++){
//                // primary diagonal
//                if (i==j){
//                    sum += array[i][j];
//                }
//
//                if (i+j == array.length -1){
//                    sum += array[i][j];
//                }
//            }
//
//        }
//
//        sum -= array[array.length/2][array.length/2];
//        return sum;


        // Optimised solution
        int sum = 0;
        int n = array.length;
        for (int i = 0; i < array.length; i++) {
            // Primary Diagonal
            sum += array[i][i];

            // Secondary diagonal
            // i+j = n-1 that's why j = n-1-i
            if (i != n - 1 - i) {
                sum += array[i][n - 1 - i];
            }
        }

        return sum;
    }


    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};

        System.out.println(diagonal_sum(arr));
    }
}
