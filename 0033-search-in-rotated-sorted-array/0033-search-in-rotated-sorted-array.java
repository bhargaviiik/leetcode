class Solution {
    public int search(int[] nums, int target) {
        int left=0,right=nums.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(target==nums[mid])return mid;
            //left half sorted
            if(nums[left]<=nums[mid]){
                if(target>=nums[left] && target<nums[mid]){  //if in the left range
                    right=mid-1; //go left
                }
                else{
                    left=mid+1; //go right
                }
            }
            //right half sorted
            else{
                if(target>nums[mid] && target<=nums[right]){ //is in the right range
                    left=mid+1; //go right
                }
                else{
                    right=mid-1; //go left
                }
            }
        }
        return -1;
    }
}