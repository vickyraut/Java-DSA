public class Staircase_Search {
    public static void staircase_search(int [][] array, int key){
        int row = array.length - 1;
        int col = 0;

        while (row >= 0 && col< array.length){
            if (key == array[row][col]){
                System.out.println("Key is at Index at ("+row+","+col+")");
                return;
            }else if (key > array[row][col]){
                col++;
            }else {
                row--;
            }
        }

        System.out.println("Key NOT found");
    }

    public static void main(String[] args) {
        int[][] arr = {{10, 20, 30, 40},
                {15, 25, 35, 45},
                {27, 29, 37, 48},
                {32,33,39,50}};

        staircase_search(arr,100);
    }
}
