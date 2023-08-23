import java.util.Scanner;

public class Reverse_Number {
    public static void main(String[] args) {
        int Number;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Number");
        Number = sc.nextInt();

        while (Number != 0) {

            int Last_Digit = (Number % 10); // last digit of any Number = it's reminder dividing by 10.
            System.out.print(Last_Digit);

            Number = (Number / 10); // Remove digit of any Number = it's Quotient dividing by 10.
        }
    }
}
