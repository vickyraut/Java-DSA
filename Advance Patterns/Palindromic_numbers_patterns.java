public class Palindromic_numbers_patterns {
    public static void palindromic_pattern(int Tot_row) {
        for (int i = 1; i <= Tot_row; i++) {

            // spaces
            for (int spaces = 1; spaces <= (Tot_row - i); spaces++) {
                System.out.print(" ");
            }

            // Decending Numbers
            for (int num = i; num >= 1; num--) {
                System.out.print(num);
            }

            // Accending numbers
            for (int num = 2; num <= i; num++) {
                System.out.print(num);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        palindromic_pattern(5);
    }
}
