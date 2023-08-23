import java.util.Scanner;

public class Array_CRUD {
    public static void main(String[] args) {
        // Creation
        int[] marks = new int[3];

        // Input
        Scanner sc = new Scanner(System.in);
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        //Output
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }

        // Same with enhanced for loop
        for (int mark : marks) {
            System.out.println(mark);
        }

        // Length of array
        System.out.println("Lenght: " + marks.length);

    }
}