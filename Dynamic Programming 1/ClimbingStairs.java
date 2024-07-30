import java.util.Arrays;

public class ClimbingStairs {

    // Recursion Approach 1
    // TC = 2^n
    public static int climbingStairs1(int n) {
        if (n == 0) {
            return 1;
        }

        if (n < 0) {
            return 0;
        }

        return climbingStairs1(n - 1) + climbingStairs1(n - 2);
    }

    // Memoization Approach 2
    // TC = O(n)
    public static int climbingStairs2(int n, int[] ways) {
        if (n == 0) {
            return 1;
        }

        if (n < 0) {
            return 0;
        }

        if (ways[n] != -1) { // Already Calculated
            return ways[n];
        }

        ways[n] = climbingStairs2(n - 1, ways) + climbingStairs2(n - 2, ways);
        return ways[n];
    }

    // Tabulation Approach 3
    // TC = O(n)
    public static int climbingStairs3(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;

        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                dp[i] = dp[i - 1]; // for dp[1] ways are 1 {dp[1] = dp[0] + dp[-1] = 1+0 = 1}
            } else {
                dp[i] = dp[i - 1] + dp[i - 2];
            }
        }

        return dp[n];
    }

    public static void main(String[] args) {
        int n = 5;
        int[] ways = new int[n + 1]; // 0,0,0,0
        Arrays.fill(ways, -1); // -1,-1,-1,-1
        System.out.println(climbingStairs1(n));
        System.out.println(climbingStairs2(n, ways));
        System.out.println(climbingStairs3(n));
    }
}
