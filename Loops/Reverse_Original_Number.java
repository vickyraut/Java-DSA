import java.util.Scanner;

public class Reverse_Original_Number {
    public static void main(String[] args) {
        int Number;
        int Reverse_Number = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Number");
        Number = sc.nextInt();

        while (Number != 0) {

            // Find Last Digit
            int Last_digit = (Number % 10); // last digit of any Number = it's reminder dividing by 10.

            // Reverse Number
            Reverse_Number = (Reverse_Number * 10) + Last_digit;

            // Update Original Number
            Number = (Number / 10); // Remove digit of any Number = it's Quotient dividing by 10.
        }

        System.out.println(Reverse_Number);
    }
}
