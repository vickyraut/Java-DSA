public class Tiling_Problem {
    public static int tiling_Problem(int n){
        // base case
        if (n==0 || n==1){
            return 1;
        }

        // kaam
        // if choice vertical
        int fm1 = tiling_Problem(n-1);

        // if choice horizontal
        int fm2 = tiling_Problem(n-2);

        int total_ways = fm1+fm2;
        return total_ways;
    }

    public static void main(String[] args) {
        System.out.println(tiling_Problem(2));
    }
}