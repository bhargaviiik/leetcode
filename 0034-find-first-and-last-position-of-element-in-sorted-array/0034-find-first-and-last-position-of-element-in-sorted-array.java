class Solution {
    public int[] searchRange(int[] nums, int target) {
        int i= findFirst(nums,target);
        int j=findLast(nums,target);
        return new int[]{i,j};
    }
    private int findFirst(int[] nums,int target){
        int left=0, right=nums.length-1;
        int mid=0,ans=-1;
        while(left<=right){
            mid= left+(right-left)/2;
            if(nums[mid]==target){
                ans=mid;
                right=mid-1;
            }
            else if(nums[mid]<target) left=mid+1;
            else right=mid-1;
        }
        return ans;
    }
    private int findLast(int[] nums,int target){
        int left=0, right=nums.length-1;
        int mid=0,ans=-1;
        while(left<=right){
            mid= left+(right-left)/2;
            if(nums[mid]==target){
                ans=mid;
                left=mid+1;
            }
            else if(nums[mid]<target) left=mid+1;
            else right=mid-1;
        }
        return ans;
    }
}