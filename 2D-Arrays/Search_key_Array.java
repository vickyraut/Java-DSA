import java.util.Scanner;

public class Search_key_Array {

    public static boolean search(int[][] array, int key) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (array[i][j] == key) {
                    System.out.println("Key found at: (" + i + "," + j + ")");
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[][] array = new int[3][4];

        //input
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        search(array, 5);

    }
}
