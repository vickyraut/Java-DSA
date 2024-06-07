import java.util.Scanner;

public class temp {
    public static void hollow_rectangle(int row, int col){
        for(int i = 0; i<row; i++){
            for(int j = 0; j<col; j++){
                if (i == 0 || i == row-1 || j == 0 || j == col-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void inverted_half_pyramid(int row, int col){
        for(int i = 0; i<=row; i++) {
            for (int j = 0; j < row-i; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        inverted_half_pyramid(a,b);
    }
}
