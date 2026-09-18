class Solution {
    public int maxProfit(int[] prices) {
        int max_profit = 0;
        int min = prices[0];
        for(int i=1;i<prices.length;i++){
            min = Math.min(min,prices[i]);
            int profit = prices[i] - min;
            max_profit = Math.max(profit,max_profit);
        }
        return max_profit;
    }
}