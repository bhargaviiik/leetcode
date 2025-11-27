class Solution {
    public int findMin(int[] nums) {
        int si=0, ei=nums.length-1;
        while(si<ei){
            if(nums[si]<nums[ei]){ //means array is sorted
                return nums[si];
            }
            int mid= si+(ei-si)/2;
            int curr= nums[mid];
            if(curr>nums[si]){ //means left is sorted-> go right 
                si=mid+1;
            } else ei=mid;  //when left is not sorted, do left
        }
        return nums[si];    
    }
}