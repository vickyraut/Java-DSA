import java.util.Scanner;

public class Swapping_without_temp {

    public static void swapping(int a, int b) {

        a = a*b; // Ex.., a=3 and b=2 so now a = 6
        b = a/b; // b = 3;
        a = a/b; // a = 2;

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
