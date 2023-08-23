import java.util.Scanner;

public class Basic_2D_Arrays {
    public static void input(int[][] array){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i<array.length;i++){
            for (int j = 0; j<array[0].length;j++){
                array[i][j] = sc.nextInt();
            }
        }
    }

    public static void output(int[][] array){
        for (int i = 0; i<array.length;i++){
            for (int j = 0; j<array[0].length; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        int[][] matrix = new int[3][3];

        input(matrix);
        output(matrix);
    }
}
