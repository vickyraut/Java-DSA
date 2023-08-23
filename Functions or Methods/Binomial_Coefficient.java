import java.util.Scanner;

public class Binomial_Coefficient {

    // Find Factorial (An Helper Function)
    public static int Factorial(int a) {
        int factorial = 1;

        for (int i = 1; i <= a; i++) {
            factorial *= i;
        }

        return factorial;
    }

    // Find Binomial Function
    public static int BinomialCoefficient(int n, int r) {

        int n_fact = Factorial(n);
        int r_fact = Factorial(r);
        int nmr_fact = Factorial((n - r));

        int binomial_coefficient = (n_fact / (r_fact * nmr_fact));

        return binomial_coefficient;
    }

    // Calling Binomial_Coefficient Function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        System.out.println("Enter the value of r");
        int r = sc.nextInt();

        System.out.println(BinomialCoefficient(n, r));
    }
}
