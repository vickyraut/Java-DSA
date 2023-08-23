import java.util.*;

public class Sum_of_NaturalNumbers {
    public static void main(String[] args) {
        int i = 1;
        int number;
        int sum = 0;

        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();

        while (i <= number) {
            sum = sum + i;
            i++;
        }

        System.out.println(sum);
    }
}
