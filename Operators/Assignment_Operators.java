/*Date = 19-01-2023
 * 
 * Task = Assignment Operators in Java
 * 
*/

public class Assignment_Operators {

    public static void main(String[] args) {

        // create variables
        int a = 4;
        int var;

        // assign value using =
        var = a;
        System.out.println("var using =: " + var);

        // assign value using +=
        var += a;
        System.out.println("var using +=: " + var);

        // assign value using -=
        var -= a;
        System.out.println("var using -=: " + var);

        // assign value using *=
        var *= a;
        System.out.println("var using *=: " + var);

        // assign value using /=
        var /= a;
        System.out.println("var using /=: " + var);

        // assign value using %=
        var %= a;
        System.out.println("var using %=: " + var);

    }

}
