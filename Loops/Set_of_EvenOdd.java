import java.util.Scanner;

// My Logic -
public class Set_of_EvenOdd {
    public static void main(String[] args) {
        int Number;
        Scanner sc = new Scanner(System.in);
        char reply = 'Y';
        int Even_Sum = 0;
        int Odd_Sum = 0;

        while (reply == 'Y' || reply == 'y') {
            System.out.println("Enter Your Number");
            Number = sc.nextInt();

            if (Number == 0) {
                break;
            } else if (Number % 2 == 0) {
                Even_Sum = Even_Sum + Number;
            } else {
                Odd_Sum = Odd_Sum + Number;
            }

            System.out.println("Do want to Enter more number? Enter Y/N ");
            reply = sc.next().charAt(0);

            if (reply == 'Y' || reply == 'y') {
                continue;
            } else if (reply == 'N' || reply == 'n') {
                break;
            } else {
                System.out.println("Invalid Input");
                break;
            }
        }

        System.out.println("Sum of Even Numbers : " + Even_Sum);
        System.out.println("Sum of Odd Numbers : " + Odd_Sum);
    }


    // Teacher's Logic -
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int number;
//        int choice;
//        int evenSum = 0;
//        int oddSum = 0;
//        do {
//            System.out.print("Enter the number ");
//            number = sc.nextInt();
//            if (number % 2 == 0) {
//                evenSum += number;
//            } else {
//                oddSum += number;
//            }
//            System.out.print("Do you want to continue? Press 1 for yes or 0 for
//                    no");
//                    choice = sc.nextInt();
//        } while (choice == 1);
//        System.out.println("Sum of even numbers: " + evenSum);
//        System.out.println("Sum of odd numbers: " + oddSum);
//    }

}