class Solution {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length+2];
        Arrays.fill(dp,-1);
        return helper(nums,0,dp);
    }
    int helper(int[] nums, int i,int[] dp){
        if(i>=nums.length){
            return 0;
        }
        if(dp[i]!=-1) return dp[i];
        int a= nums[i] +helper(nums,i+2,dp); //we cannot include previous taken cashes, in our ans because the order can be di
        int b= helper(nums,i+1,dp);
        return dp[i]= Math.max(a,b);
    }
}