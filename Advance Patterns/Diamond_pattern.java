public class Diamond_pattern {


    public static void Diamond_Pattern(int n) {
        for (int i = 1; i <= n; i++) {

            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // stars
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        for (int i = n; i >= 1; i--) {

            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // stars
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }


    // My Logic
//    public static void Diamond_Pattern(int n) {
//        for (int i = 1; i <= n; i++) {
//
//            // spaces
//            for (int j = 1; j <= n - i; j++) {
//                System.out.print(" ");
//            }
//
//            // stars
//            for (int j = 1; j <= (i + (i - 1)); j++) {
//                System.out.print("*");
//            }
//
//            System.out.println();
//        }
//
//        for (int i = n; i >= 1; i--) {
//
//            // spaces
//            for (int j = 1; j <= n - i; j++) {
//                System.out.print(" ");
//            }
//
//            // stars
//            for (int j = 1; j <= (i + (i - 1)); j++) { // No of stars in current line = number of previous line - 1;
//                System.out.print("*");
//            }
//
//            System.out.println();
//        }
//
//    }

    public static void main(String[] args) {
        Diamond_Pattern(4);
    }
}
