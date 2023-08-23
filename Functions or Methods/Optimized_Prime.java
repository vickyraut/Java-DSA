import static java.lang.Math.sqrt;

public class Optimized_Prime {

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

    public static void main(String[] args) {
        System.out.println(isPrime(7));
    }
}
