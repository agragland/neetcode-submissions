class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int buy = prices[0];

        for(int i = 1; i < prices.length; i++){
            int sell = prices[i];
            int sum = sell - buy;
            if(sum < 0) {
                buy = sell;
            } else {
                profit = Math.max(profit, sum);
            }
        }
        

        return profit;
    }
}
