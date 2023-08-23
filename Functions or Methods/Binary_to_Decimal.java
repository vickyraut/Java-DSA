import java.util.Arrays;

import static java.lang.Math.pow;

public class Binary_to_Decimal {

    public static void Bin_Dec(int Bin_number) {
        int Dec_number = 0;
        int pow = 0;

        while (Bin_number > 0) {
            int Last_Digit = (Bin_number % 10);
            Dec_number = Dec_number + (int) (Last_Digit * pow(2, pow));
            pow++;
            Bin_number = (Bin_number / 10);
        }

        System.out.println(Dec_number);
    }

    public static void main(String[] args) {
        Bin_Dec(101);
    }
}
