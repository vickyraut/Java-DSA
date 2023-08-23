import java.util.*;

public class Positive_or_Negative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your No :-");
        int num = sc.nextInt();

        if (num > 0) {
            System.out.println("Number is Positive");
        } else if (num == 0) {
            System.out.println(" The number zero is neither positive nor negative.");
        } else {
            System.out.println("Number is Negative");
        }

        sc.close();
    }
}