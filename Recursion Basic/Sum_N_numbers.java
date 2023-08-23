public class Sum_N_numbers {
    private static int calc_SUM(int n) {
        if (n==1){
            return 1;
        }
        int sum_n_minus_1 = calc_SUM(n-1);
        int sum_n = n+sum_n_minus_1;
        return sum_n;
    }

    public static void main(String[] args) {
        System.out.println(calc_SUM(10));
    }
}
