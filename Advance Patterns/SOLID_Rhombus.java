public class SOLID_Rhombus {

    public static void solid_rhombus(int Tot_rows) {
        // Every Row
        for (int i = 1; i <= Tot_rows; i++) {

            // Spaces
            for (int j = 1; j <= (Tot_rows - i); j++) {
                System.out.print(" ");
            }

            // Stars
            for (int k = 1; k <= Tot_rows; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        solid_rhombus(10);
    }
}
