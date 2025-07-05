public class BestTimeToBuyAndSellStock {

    public static int maxProfit(int[] prices) {

        int minPrice = Integer.MAX_VALUE;
        int maxiProfit = 0;
        int diff = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else {
                diff = prices[i] - minPrice;
            }

            maxiProfit = Math.max(diff, maxiProfit);
        }

        return maxiProfit;

    }

    public static void main(String[] args) {
        // int[] prices = { 7, 1, 5, 3, 6, 4 };
        int[] prices = { 7, 6, 4, 3, 1 };

        System.out.println(maxProfit(prices));
    }

}
