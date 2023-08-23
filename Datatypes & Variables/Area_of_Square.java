/*Date = 19-01-2023
 *
 * Task = Area of square in Java
*/

import java.util.*;

public class Area_of_Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The side of sqaure");
        int side = sc.nextInt();

        long Area = side * side;

        System.out.println("Area of square of side " + side + " is " + Area);

    }
}
