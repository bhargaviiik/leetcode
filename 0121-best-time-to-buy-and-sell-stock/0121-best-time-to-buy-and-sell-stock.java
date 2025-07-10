class Solution {
    public int maxProfit(int[] prices) {
        int min=Integer.MAX_VALUE,profit=0,currProfit=0;
        for(int i=0;i<prices.length;i++){
            min=Math.min(prices[i],min);
            currProfit=prices[i]-min;
            profit=Math.max(profit,currProfit);
        }
        return profit;
    }
}