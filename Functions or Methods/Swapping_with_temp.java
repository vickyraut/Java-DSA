import java.util.Scanner;

public class Swapping_with_temp {

    public static void swapping(int a, int b) {
        int temp = a;

        a = b;
        b = temp;

        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        swapping(a, b);
    }
}
