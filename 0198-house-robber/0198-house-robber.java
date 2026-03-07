class Solution {
    public int rob(int[] nums) {
        // recurrence relation: dp[i]=max(dp[i−1], dp[i−2]+nums[i]);
        int prev1=0;
        int prev2=0;
        for(int i=0;i<nums.length;i++){
            int curr=Math.max(prev1,prev2+nums[i]);
            prev2=prev1;
            prev1=curr;
        }
        return prev1;
    }
    //SC: O(N)
    //dp[i-1] → skip this house
    //dp[i-2] + nums[i] → rob this house
}