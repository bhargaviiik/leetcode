class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left=0, right=nums.length-1;
        while(left<=right){
            int mid= left+(right-left)/2;
            if(nums[mid]==target){
                int i=mid,j=mid;
                while(i>0 && nums[i-1]==nums[mid]) i--;
                while(j<nums.length-1 && nums[j+1]==nums[mid]) j++;
                return new int[]{i,j};
            }
            if(nums[mid]<target) left=mid+1;
            else right=mid-1;
            }
        return new int[]{-1,-1};
    }
}