import java.util.Scanner;

public class SumOfNaturalNumber {

    public static void main(String[] args) {

        double sum = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Number");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
