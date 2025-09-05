class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length==0) return 0;
        int max=nums[0];
        int[] prefix = new int[nums.length];
        prefix[0]=nums[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i]=nums[i]+prefix[i-1];
            max=Math.max(max,prefix[i]);
        }
        
        for(int start=1;start<nums.length;start++){
            for(int end=start;end<nums.length;end++){
                max=Math.max(max,prefix[end]-prefix[start-1]);
            }
        }
        return max;
    }
}