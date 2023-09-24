class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length <= 1)
            return 0;
        int buyPrice = prices[0];
        int profit = 0;
        for (int price : prices) {
            profit = Math.max(profit, price - buyPrice);
            buyPrice = Math.min(buyPrice, price);
        }
        return profit;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] prices = { 7, 1, 5, 3, 6, 4 };
        Solution solution = new Solution();
        solution.maxProfit(prices);
    }
}