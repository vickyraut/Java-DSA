import java.util.Scanner;

public class Factorial_of_N {
    public static void main(String[] args) {
        int num; // To hold Number
        int Factorial = 1; // To hold Factorial

        System.out.print("Enter any Positive Number : ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            Factorial *= i;
        }

        System.out.println("Factorial is : " + Factorial);
    }
}
