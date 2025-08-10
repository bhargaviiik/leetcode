class Solution {
    public int climbStairs(int n) {
        int count=0;
        int[] dp=new int[n+1];
        return helper(count,n,dp);
    }
    public int helper(int count,int n,int[] dp){
        if(n>=0 && dp[n]!=0) return dp[n];
        if(n==0) return 1;
        if(n<0) return 0;
        count += helper(count,n-1,dp) + helper(count,n-2,dp);
        dp[n]=count;
        return count;
    }
}