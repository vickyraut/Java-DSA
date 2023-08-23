import java.util.Scanner;

public class Ternary_Operator2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();

        // Ternary Operator
        String result = (marks >= 35) ? "PASS" : "FAIL";
        System.out.println(result);

        sc.close();
    }
}