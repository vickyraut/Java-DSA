import java.util.Scanner;

public class Half_Pyramid {
    public static void main(String[] args) {
        int Total_Lines;

        System.out.print("Enter Total number of lines you want : ");
        Scanner sc = new Scanner(System.in);
        Total_Lines = sc.nextInt();

        for (int line = 1; line <= Total_Lines; line++) {
            for (int star = 1; star <= line; star++) { // stars has to be equal to no of line
                System.out.print("*");
            }
            System.out.println(); // For next Line
        }
    }
}
