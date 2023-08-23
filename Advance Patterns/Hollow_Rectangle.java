import java.util.Scanner;

public class Hollow_Rectangle {
    public static void hollow_rect(int Tot_rows, int Tot_Colmn) {
        for (int i = 1; i <= Tot_rows; i++) {

            for (int j = 1; j <= Tot_Colmn; j++) {
                if (i == 1 || i == Tot_rows || j == 1 || j == Tot_Colmn) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        hollow_rect(a, b);
    }
}