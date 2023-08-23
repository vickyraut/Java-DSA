public class Hollow_Rhombus {
    public static void hollow_rhombus(int n) {
        // rows
        for (int i = 1; i <= n; i++) {

            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // stars = hollow rectangle code
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }

            System.out.println(); // new line
        }
    }

    public static void main(String[] args) {
        hollow_rhombus(5);
    }
}
