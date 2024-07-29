public class Fibonacci {

    // Memoization Approach
    public static int fib(int n, int[] dp) {
        if (n == 0 || n == 1) {
            return n;
        }

        if (dp[n] != 0) {
            return dp[n];
        }

        dp[n] = fib(n - 1, dp) + fib(n - 2, dp);
        return dp[n];
    }

    // Tabulation Approach
    public static int fib2(int n, int[] dp) {
        dp[0] = 0; // In java after initialization value is 0 by default.
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }

    public static void main(String[] args) {
        int n = 5;
        int[] dp = new int[n + 1]; // 0,0,0,0,0
        System.out.println(fib(n, dp));
        System.out.println(fib2(n, dp));
    }
}
