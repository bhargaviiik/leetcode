class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE,maxSum=0,minSum=0,n=nums.length,totSum=0;
        for(int i=0;i<n;i++){
            totSum+=nums[i];
            maxSum+=nums[i];
            minSum+=nums[i];
            max=Math.max(max,maxSum);
            min=Math.min(min,minSum);
            if(maxSum<0) maxSum=0;
            if(minSum>0) minSum=0;
        }
        if(max<0) return max;
        return Math.max(max,totSum-min);
    }
}