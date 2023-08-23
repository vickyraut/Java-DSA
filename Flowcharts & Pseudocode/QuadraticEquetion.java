import java.util.Scanner;

import static java.lang.Math.*;

public class QuadraticEquetion {

    static void findroots(double a, double b, double c){

        double root1, root2;

        if (a == 0){
            System.out.println("Invalid");
        }

        double discriminant = b*b-4*a*c;
        double sqrt_value = sqrt(discriminant);

        if (discriminant==0){
            System.out.println("Roots are real and same \n");
            root1 = root2 = -b/(2*a);
            System.out.println("root 1 is : "+ root1 + "root 2 is : " +root2);

        } else if (discriminant>0) {
            System.out.println("Roots are real and different \n");
            root1 = (-b + sqrt_value) / (2*a);
            root2 = (-b - sqrt_value) / (2*a);
            System.out.println("root 1 is : "+ root1 + "root 2 is : " +root2);
        }
        else {
            System.out.println("Roots are Complex\n");
            root1 = -b/(2*a) + sqrt_value/(2*a);
            root2 = -b/(2*a) - sqrt_value/(2*a);
            System.out.println("root 1 is : "+ root1 +"i "+ "root 2 is : " +root2 +"i");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value of a :");
        double a = sc.nextDouble();

        System.out.println("Enter value of b :");
        double b = sc.nextDouble();

        System.out.println("Enter value of c :");
        double c = sc.nextDouble();

        findroots(a,b,c);
    }
}
