public class Solution {
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length < 1){
            return 0;
        }
        int end = prices[0];
        int profit = 0;
        for(int i = 1; i < prices.length; i++){
            if(prices[i] < end){
                end = prices[i];
            }
            if(prices[i] > end){
                profit = Math.max(prices[i]-end, profit);
            }
        }
        return profit;
    }
}