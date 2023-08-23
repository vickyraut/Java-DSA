import java.util.*;

public class Income_Tax_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();

        double tax;

        if (income <= 500000) {
            tax = 0;
        } else if (income <= 1000000 && income > 500000) {
            tax = 0.2 * (income - 500000);
        } else {
            tax = 0.2 * (income - 500000) + 0.3 * (income - 1000000);
        }
        System.out.println("Your total tax = Rs." + tax);

        sc.close();
    }
}
