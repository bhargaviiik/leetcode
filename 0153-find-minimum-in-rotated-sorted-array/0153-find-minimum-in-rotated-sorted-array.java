class Solution {
    public int findMin(int[] nums) {
        int si=0, ei=nums.length-1;
        int min=5001;
        while(si<=ei){
            int mid= si+(ei-si)/2;
            int curr= nums[mid];
            if(curr<min) min=curr;
            
            if(curr>nums[ei]){  //then left is sorted -> consider si and further search in right
                if(nums[si]<min) min=nums[si];
                si=mid+1;
            }
            else{   //search in left, conisdering right is sorted, we just check for the mid+1 element
                if(mid+1<nums.length){
                    if(nums[mid+1]<min) min=nums[mid+1];
                } 
                ei=mid-1;  
            }
        }
        return min;
    }
}