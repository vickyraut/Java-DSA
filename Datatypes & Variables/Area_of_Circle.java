/*Date = 19-01-2023
 * 
 * Task = Area of circle in Java
 */

import java.util.*;

public class Area_of_Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float radius = sc.nextFloat();
        float area = 3.14f * radius * radius;

        System.out.println(area);

        sc.close();
    }
}
