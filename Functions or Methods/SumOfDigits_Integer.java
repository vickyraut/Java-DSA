import java.util.Scanner;

public class SumOfDigits_Integer {
    public static int sum_Digits(int num) {
        int sum = 0;

        while (num > 0) {
            int last_digit = num % 10;

            sum += last_digit;

            num /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        System.out.println(sum_Digits(a));
    }
}
