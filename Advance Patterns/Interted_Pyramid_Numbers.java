public class Interted_Pyramid_Numbers {

    public static void inverted_pyramid_number(int Tot_rows) {

        for (int row = 0; row < Tot_rows; row++){

            //numbers
            for (int num = 1; num <= (Tot_rows-row); num++){
                System.out.print(num);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        inverted_pyramid_number(5);
    }

}
