import java.util.Scanner;

public class Increasing_numbers {
    private static void print_inc(int n) {
        if (n==1){
            System.out.println(n);
            return;
        }
        print_inc(n-1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number to get Increasing number list: ");
        int n = sc.nextInt();
        print_inc(n);
    }
}
