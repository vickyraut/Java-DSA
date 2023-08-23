import java.util.Scanner;

public class Factorial_Function {

    public static int Factorial(int a) {
        int factorial = 1;

        for (int i = 1; i <= a; i++) {
            factorial *= i;
        }

        return factorial;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Positive Number");
        int a = sc.nextInt();

        int factorial = Factorial(a);
        System.out.println(factorial);
    }
}
