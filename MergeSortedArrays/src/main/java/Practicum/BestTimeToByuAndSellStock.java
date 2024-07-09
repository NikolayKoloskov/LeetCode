package Practicum;

/**
 * #121. Best Time to Buy and Sell Stock. Leetcode. https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
 */

public class BestTimeToByuAndSellStock {
    public int maxProfit(int[] prices) {
        int maxItemIndex = 0;
        int minItemIndex = 0;
        int maxSell = 0;
        for (int i = 0; i < prices.length; i++) {

            if (prices[i] > prices[maxItemIndex]) {
                maxItemIndex = i;
            }
            if (prices[i] < prices[minItemIndex]) {
                minItemIndex = i;
            }
            if (prices[i] - prices[minItemIndex] > maxSell) {
                maxSell = prices[i] - prices[minItemIndex];
                maxItemIndex = i;
            }
        }
        return maxSell;
    }

    public static void main(String[] args) {
        BestTimeToByuAndSellStock bestTimeToByuAndSellStock = new BestTimeToByuAndSellStock();
        int[] prices = {2, 4, 1};
        System.out.println(bestTimeToByuAndSellStock.maxProfit(prices));
    }
}
