class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        // apply sliding window on k
        int i=k-1;
        int j=0;
        int diff=100001;
        while(i<nums.length){
            diff=Math.min(diff,nums[i]-nums[j]);
            i++;
            j++;
        }
        return diff;
    }
}