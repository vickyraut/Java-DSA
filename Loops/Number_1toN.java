import java.util.*;

public class Number_1toN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int counter = 1;

        while (counter <= N) {
            System.out.println(counter);
            counter++;
        }
    }
}
