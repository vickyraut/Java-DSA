public class zero_one_triangle {

    public static void zero_one(int Tot_row) {
        for (int i = 1; i <= Tot_row; i++) {
            for (int j = 1; j <= i; j++) {
                int even_odd = i + j;
                if (even_odd % 2 == 0) {//even
                    System.out.print("1" + " ");
                } else {// odd
                    System.out.print("0" + " ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        zero_one(5);
    }
}
