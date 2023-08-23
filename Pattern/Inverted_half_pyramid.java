import java.util.Scanner;

public class Inverted_half_pyramid {
    public static void main(String[] args) {
        int Total_Lines;

        System.out.print("Enter Total number of lines you want : ");
        Scanner sc = new Scanner(System.in);
        Total_Lines = sc.nextInt();

        for (int line = Total_Lines; line >= 1; line--) {

            for (int star = 1; star <= line; star++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    //Lecture Logic

//    public static void main(String[] args) {
//        int n = 4;
//        // Line incrementing in every iteration
//        for (int line = 1; line <= n; line++) {
//
//            // Stars in a line = n-number of current line+ 1   [Ex..., 4-1+1 = 4 . Means 4 stars get printed in first line]
//            for (int star = 1; star <= n - line + 1; star++) {
//                System.out.print("*");
//            }
//
//            System.out.println();
//        }
//    }
}