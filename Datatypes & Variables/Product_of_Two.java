/*Date = 19-01-2023
 * 
 * Task = Product of two Numbers in Java
 */

import java.util.Scanner;

public class Product_of_Two {

    public static void main(String[] args) {
        int a;
        int b;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Number - ");
        a = sc.nextInt();
        System.out.println("Enter 2st Number - ");
        b = sc.nextInt();

        int product = a * b;
        System.out.println(product);

        sc.close(); // This line is optional is warning are irriteting you in VS Code
    }

}