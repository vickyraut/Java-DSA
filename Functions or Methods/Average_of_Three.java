import java.util.Scanner;

public class Average_of_Three {

    public static int Avg_Three(int a, int b, int c) {
        int average;

        average = (a + b + c) / 3;

        return average;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(Avg_Three(a, b, c));

    }
}
