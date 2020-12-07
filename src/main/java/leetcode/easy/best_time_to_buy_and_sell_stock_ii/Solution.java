package leetcode.easy.best_time_to_buy_and_sell_stock_ii;

/**
 * 재귀로 모든 경우의 수로 풀면 time limit 걸림
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/discuss/959062/Java-easy
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
 */
public class Solution {
    public int maxProfit(int[] prices) {
        int sum = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] - prices[i - 1] > 0) sum = sum + prices[i] - prices[i - 1];
        }

        return sum;
    }
}
