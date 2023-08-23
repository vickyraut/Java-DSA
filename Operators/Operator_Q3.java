/*Date = 19-01-2023
 * 
 * Task = What will be the solution of given code..?
 * 
 * Ans:- 4,0,0
 * 
*/

public class Operator_Q3 {
    public static void main(String[] args) {
        int x, y, z;
        x = y = z = 2;
        x += y;
        y -= z;
        z /= (x + y);
        System.out.println(x + " " + y + " " + z);
    }
}
