public class Inverted_Pyramid {
    public static void inverted_half_pyramid(int Tot_rows) {

        // Total lines to print
        for (int row = 1; row <= Tot_rows; row++) {

            // Total Spaces to Print
            for (int spaces = 1; spaces <= (Tot_rows - row); spaces++) {
                System.out.print(" ");
            }

            // Total Stars to print
            for (int stars = 1; stars <= row; stars++) {
                System.out.print("*");
            }

            System.out.println(); // new line
        }
    }

    public static void main(String[] args) {
        inverted_half_pyramid(4);
    }
}