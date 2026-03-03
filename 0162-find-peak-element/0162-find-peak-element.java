class Solution {
    public int findPeakElement(int[] nums) {
        //appraoch 2
        int i=0;
        while(nums[i]<nums[i+1]) i++;  //didnt include while i<n-1 cause question gurantees of atleast one peak so we'll always find it
        return i;
    }
}