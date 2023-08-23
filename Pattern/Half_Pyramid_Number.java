import java.util.Scanner;

public class Half_Pyramid_Number {
    public static void main(String[] args) {
        int Total_Lines;

        System.out.print("Enter Total number of lines you want : ");
        Scanner sc = new Scanner(System.in);
        Total_Lines = sc.nextInt();

        for (int line = 1; line <= Total_Lines; line++) {
            for (int number = 1; number <= line; number++) {
                System.out.print(number);
            }
            System.out.println();
        }

    }
}
