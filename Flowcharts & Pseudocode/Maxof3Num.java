import java.util.Scanner;

public class Maxof3Num {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st Number");
        int a = sc.nextInt();

        System.out.println("Enter 2st Number");
        int b = sc.nextInt();

        System.out.println("Enter 3st Number");
        int c = sc.nextInt();

//        if (a >= b) {
//            if (a >= c) {
//                System.out.println(a + " is the greatest among all.");
//            } else {
//                System.out.println(c + " is the greatest among all.");
//            }
//        } else if (b >= c) {
//            System.out.println(b + " is the greatest among all.");
//        } else {
//            System.out.println(c + " is the greatest among all.");
//        }


        if ((a>=b) && (a>=c)){
            System.out.println(a + "is the greatest among all.");
        } else if (b >= c) {
            System.out.println(b + "is the greatest among all.");
        }
        else {
            System.out.println(c + "is the greatest among all.");
        }
    }
}
