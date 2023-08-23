import java.util.Scanner;

public class Simple_Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st Number");
        int num1 = sc.nextInt();
        System.out.println("Enter 2st Number");
        int num2 = sc.nextInt();
        System.out.println("Enter Operator");
        char operator = sc.next().charAt(0);

        switch (operator){
            case '+':
                System.out.println(num1+num2);
                break;
            case '-':
                System.out.println(num1-num2);
                break;
            case '*':
                System.out.println(num1*num2);
                break;
            case'/':
                System.out.println(num1 / num2);
                break;
            case '%':
                System.out.println(num1 % num2);
                break;
            default:
                System.out.println("Sorry My Calculator is not that Advanced :)");



                //Example of new Enhanced loop
//                switch (operator) {
//                    case '+' -> System.out.println(num1 + num2);
//                    case '-' -> System.out.println(num1 - num2);
//                    case '*' -> System.out.println(num1 * num2);
//                    case '/' -> System.out.println(num1 / num2);
//                    case '%' -> System.out.println(num1 % num2);
//                    default -> System.out.println("Sorry My Calculator is not that Advanced :)");
        }
    }
}
