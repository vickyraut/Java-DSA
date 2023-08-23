import java.util.Scanner;

public class Decreasing_numbers {
    private static void print_dec(int n) {
        if (n==1){
            System.out.print(n);
            return;
        }

        System.out.print(n+" ");
        print_dec(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number to get decreasing number list: ");
        int n = sc.nextInt();
        print_dec(n);
    }

}
