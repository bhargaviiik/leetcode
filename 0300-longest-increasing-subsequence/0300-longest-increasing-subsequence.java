class Solution {
    public int lengthOfLIS(int[] nums) {
        int[][] dp = new int[nums.length][nums.length+1]; //idx,lastidx
        for(int[] row : dp) Arrays.fill(row, -1);
        return helper(nums,0,-1,dp);
    }
    int helper(int[] nums,int i,int lastidx,int[][] dp){
        if(i>=nums.length) return 0;
        if(dp[i][lastidx+1]!=-1) return dp[i][lastidx+1];
        int take=0;
        if(lastidx==-1 || nums[i]>nums[lastidx]) take= helper(nums,i+1,i,dp)+1;
        int skip= helper(nums,i+1,lastidx,dp);
        return dp[i][lastidx+1]=Math.max(take,skip);
    }
}