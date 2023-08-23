import java.util.Scanner;

public class Function_Calculator {

    public static void Addition(int a, int b) {
        int result = a + b;
        System.out.println(result);
    }

    public static void Substraction(int a, int b) {
        int result = a - b;
        System.out.println(result);
    }

    public static void Multiplication(int a, int b) {
        int result = a * b;
        System.out.println(result);
    }

    public static void Division(int a, int b) {
        int result = a / b;
        System.out.println(result);
    }

    public static void Reminder(int a, int b) {
        int result = a % b;
        System.out.println(result);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st Number");
        int num1 = sc.nextInt();
        System.out.println("Enter 2st Number");
        int num2 = sc.nextInt();
        System.out.println("Enter Operator");
        char operator = sc.next().charAt(0);

        // Enhanced switch statement

        switch (operator) {
            case '+' -> Addition(num1, num2);
            case '-' -> Substraction(num1, num2);
            case '*' -> Multiplication(num1, num2);
            case '/' -> Division(num1, num2);
            case '%' -> Reminder(num1, num2);
            default -> System.out.println("Sorry My Calculator is not that Advanced :)");
        }
    }
}
