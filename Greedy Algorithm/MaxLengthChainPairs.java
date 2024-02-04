import java.util.Arrays;
import java.util.Comparator;

public class MaxLengthChainPairs {
    public static int maxChainPairs(int[][] pairs) {
        int maxPairs = 0;
        int prevEnd = 0;
        Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1]));

        // Adding first pair
        maxPairs = 1;
        prevEnd = pairs[0][1];

        for (int i = 1; i < pairs.length; i++) {
            if (pairs[i][0] >= prevEnd) {
                maxPairs++;
                prevEnd = pairs[i][1];
            }
        }

        return maxPairs;
    }

    public static void main(String[] args) {
        int[][] pairs = {{5, 24}, {39, 60}, {5, 28}, {27, 40}, {50, 90}};
        System.out.println(maxChainPairs(pairs));
    }
}
