import static java.lang.Math.sqrt;

public class Prime_in_Range {

    public static boolean isPrime(int num) {
        if (num == 2) {
            return true;
        }
        for (int i = 2; i <= sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void range_Prime(int range) {

        for (int i = 2; i <= range; i++) {

            if (isPrime(i)) {
                System.out.println(i);
            }
        }

    }

    public static void main(String[] args) {
        range_Prime(100);
    }
}
