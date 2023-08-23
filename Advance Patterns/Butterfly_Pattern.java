public class Butterfly_Pattern {
    public static void butterfly_pattern(int Tot_row) {

        // 1st part
        for (int row = 1; row <= Tot_row; row++) {

            // stars -> stars <= row
            for (int star = 1; star <= row; star++) {
                System.out.print("*");
            }

            // spaces -> 2*(Total_rows - row)
            for (int spaces = 1; spaces <= (2 * (Tot_row - row)); spaces++) {
                System.out.print(" ");
            }

            // stars -> stars <= row
            for (int star = 1; star <= row; star++) {
                System.out.print("*");
            }
            System.out.println();// new line
        }

        // 2nd Mirror Image
        for (int row = Tot_row; row >= 1; row--) {
            // stars -> stars <= row
            for (int star = 1; star <= row; star++) {
                System.out.print("*");
            }

            // spaces -> 2*(Total_rows - row)
            for (int spaces = 1; spaces <= (2 * (Tot_row - row)); spaces++) {
                System.out.print(" ");
            }

            // stars -> stars <= row
            for (int star = 1; star <= row; star++) {
                System.out.print("*");
            }
            System.out.println();// new line
        }

    }

    public static void main(String[] args) {
        butterfly_pattern(4);
    }
}