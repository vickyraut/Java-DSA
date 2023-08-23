public class Number_Pyramid {
    public static void number_pyramid(int Tot_row) {
        for (int i = 1; i <= Tot_row; i++) {

            // spaces
            for (int j = 1; j <= (Tot_row - i); j++) {
                System.out.print(" ");
            }

            // Numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        number_pyramid(5);
    }
}
