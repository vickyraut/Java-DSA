import java.util.Scanner;

public class Palindrome_or_Not {

    public static int revese_num(int num) {
        int Reverse_Number = 0;

        while (num != 0) {
            int last_digit = num % 10;

            Reverse_Number = (Reverse_Number * 10) + last_digit;

            num = num / 10;
        }

        return Reverse_Number;
    }

    public static void isPelindrome(int num) {

        int temp = revese_num(num);

        if (temp == num) {
            System.out.println("Number is Palindrome");
        } else {
            System.out.println("Number is Not a Palindrome");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        isPelindrome(a);
    }
}
