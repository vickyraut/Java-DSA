public class Largest_of_Three {
    public static void main(String[] args) {
        int a = 14;
        int b = 6;
        int c = 9;

        if (a>= b && a>=c) {
            System.out.println("A is largest");
        }else if (b>c) {
            System.out.println("B is largest");
        }else{
            System.out.println("C is largest");
        }
    }
}
