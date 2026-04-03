class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double ans=0;
        int prefix=0;
        for(int i=0;i<nums.length;i++){
            prefix+=nums[i];
            if(i==k-1) ans=(double)prefix/k;
            if(i>=k) {
                prefix-=nums[i-k];
                ans=Math.max(ans,(double)(prefix)/k);
            }
        }
        return ans;
    }
}