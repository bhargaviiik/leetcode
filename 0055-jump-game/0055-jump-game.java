class Solution {
    public boolean canJump(int[] nums) {
        Boolean[] dp = new Boolean[nums.length];
        if(helper(0,nums,dp))return true;
        return false;
    }
    boolean helper(int i,int[] nums,Boolean[] dp){
        if(i==nums.length-1) return true;
        if(i>nums.length-1) return false;
        if(dp[i]!=null) return dp[i]; //its gonna be always false here
        
        int currCap=nums[i];
        while(currCap>0){
            if(helper(i+currCap,nums,dp))return true;
            currCap--;
        }
        return dp[i]=false;
    }
}