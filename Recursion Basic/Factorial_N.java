public class Factorial_N {
    private static int calc_factorial(int n) {
        if (n==0){
            return 1;
        }

        int fact_n_minus_1 = calc_factorial(n-1);
        int fact_n = n * fact_n_minus_1;

        return fact_n;
    }

    public static void main(String[] args) {
        System.out.println(calc_factorial(5));
    }
}
