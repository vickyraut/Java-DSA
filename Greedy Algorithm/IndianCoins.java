import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class IndianCoins {
    public static void main(String[] args) {
        int amount = 590;
        // Type Integer(Non premitive is mandatory)
        Integer[] coins = {1, 3, 5, 10, 20, 50, 100, 500, 2000};
        int totalCoins = 0;

        // Greedy approach by using the greatest amount of coin first;
        Arrays.sort(coins, Comparator.reverseOrder());

        // Storing which coins are used
        ArrayList<Integer> coinsUsed = new ArrayList<>();

        for (int i = 0; i < coins.length; i++) {
            int currentCoin = coins[i];
            while (currentCoin <= amount) {
                amount -= currentCoin;
                totalCoins++;
                coinsUsed.add(currentCoin);
            }
        }

        System.out.println(totalCoins);
        System.out.println(coinsUsed);
    }
}
