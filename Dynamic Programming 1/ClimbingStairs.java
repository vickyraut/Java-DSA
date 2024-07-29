public class ClimbingStairs {

    // Recursion Approach 1
    public static int climbingStairs1(int n) {
        if (n == 0) {
            return 1;
        }

        if (n < 0) {
            return 0;
        }

        return climbingStairs1(n - 1) + climbingStairs1(n - 2);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(climbingStairs1(n));
    }
}
