import java.util.Scanner;

public class IsPrime {

//     1st method using while loop
//
//    public static void main(String[] args) {
//        int i = 1;
//        int counter = 0;
//
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//
//        while (i <= num) {
//            if (num % i == 0) {
//                counter += 1;
//            }
//            i++;
//        }
//
//        if (counter == 2) {
//            System.out.println("Prime");
//        } else System.out.println("Non-Prime");
//    }


    //2nd using for loop

    public static void main(String[] args) {
        int counter = 0;

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 2; i < num; i++) {

            if (num % i == 0) {
                counter = counter + 1;
            }
        }

        if (counter > 0) {
            System.out.println("Number is Non Prime");
        } else {
            System.out.println("Number is Prime");
        }
    }

}
