import java.util.Scanner;

public class Even_Odd {
    public static void isEven_odd(int num) {
        int bitmask = 1;
        if ((num & bitmask) == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Number");
        int num = sc.nextInt();
        isEven_odd(num);
    }
}
