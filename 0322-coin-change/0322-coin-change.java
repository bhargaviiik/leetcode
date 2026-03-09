class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dp= new int[amount+1];
        Arrays.fill(dp,-1);
        int ans=helper(coins, amount,dp);
        return ans==Integer.MAX_VALUE?-1:ans;
    }
    int helper(int[] coins, int amount,int[] dp){
        if(amount==0) return 0;
        if(dp[amount]!=-1) return dp[amount];
        int min=Integer.MAX_VALUE;
        for(int j=0;j<coins.length;j++){
            int curr=coins[j];
            if(amount-curr>=0){
                int ans=helper(coins, amount-curr,dp);
                if(ans!=Integer.MAX_VALUE){   //bc if we add one to Integer.MAX_VALUE, it could cause integer overflow making it -ve..
                    min=Math.min(min,ans+1);
                }
            }
        }
        return dp[amount]=min;
    }
}