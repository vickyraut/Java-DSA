public class Buy_Sell_Stocks2 {

    public static int buy_sell_stocks(int[] prices) {
        int buying_price = Integer.MAX_VALUE;
        int max_profit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (buying_price < prices[i]) {
                int profit = prices[i] - buying_price;
                max_profit = Math.max(max_profit, profit);
            } else {
                buying_price = prices[i];
            }
        }
        return max_profit;
    }

    public static void main(String[] args) {
        int[] arr = {7, 1, 5, 3, 6, 4};

        System.out.println(buy_sell_stocks(arr));
    }
}
