/*
 * Floyd's triangle is a triangular array of natural numbers, used in computer science education.
 * It is named after Robert Floyd.
 * It is defined by filling the rows of the triangle with consecutive numbers
 * */

public class FLOYDs_triangle {

    public static void floyds_triangle(int Tot_row) {
        // To get numbers in consecutive format
        int counter = 1;

        // Outer loop = lines
        for (int i = 1; i <= Tot_row; i++) {

            // print number here, number in line = row_no that is  i
            for (int j = 1; j <= i; j++) {
                System.out.print(counter + " ");
                // Increase counter
                counter++;
            }
            System.out.println(); //new line
        }
    }

    public static void main(String[] args) {
        floyds_triangle(5);
    }
}
