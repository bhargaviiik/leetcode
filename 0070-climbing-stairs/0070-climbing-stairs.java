class Solution {
    // this is chotu wala logic... when i know the answer for a small input, i calculate it for larger ones....
    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        return helper(n,dp);
    }
    int helper(int n, int[] dp){
        if(dp[n]!=0) return dp[n];
        if(n==1) return 1;
        if(n==0) return 1;
        return dp[n]=helper(n-1,dp)+helper(n-2,dp);
    }
}