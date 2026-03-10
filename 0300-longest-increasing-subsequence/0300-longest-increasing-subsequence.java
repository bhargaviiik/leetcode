class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] tails= new int[nums.length];
        int size=0;
        for(int num:nums){
            int left=0,right=size;
            while(left<right){
                int mid=left+(right-left)/2;
                if(tails[mid]>=num){
                    right=mid;    //if greater then go to left and check if there is a num smaller than this and greater than num
                }
                else{
                    left=mid+1;   //if smaller then move to right we cant replace a smaller number
                }
            }
            tails[left]=num;
            if(left==size) size++;
        }
        return size;
    }
}