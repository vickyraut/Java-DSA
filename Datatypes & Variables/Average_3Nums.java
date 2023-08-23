/*Date = 19-01-2023
 * 
 * Task = Average of three Numbers in Java
 */

import java.util.*;

public class Average_3Nums {
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        //Here are we are learning concept of typecasting also..
        float Average = (float)(a+b+c)/3;

        System.out.println(Average);
    }
}
