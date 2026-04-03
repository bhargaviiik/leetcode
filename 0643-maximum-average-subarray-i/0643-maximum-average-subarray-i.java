class Solution {
    public double findMaxAverage(int[] nums, int k) {
        if(nums.length==1) return nums[0];
        double ans=0;
        int[] prefix= new int[nums.length];
        prefix[0]=nums[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+nums[i];
            if(i==k-1) ans=(double)prefix[i]/k;
            if(i>=k) {
                ans=Math.max(ans,(double)(prefix[i]-prefix[i-k])/k);
            }
        }
        return ans;
    }
}