class Solution {
    public boolean check(int[] nums) {
        int k=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<nums[i-1]){
                k=i;
                break;
            }
        }
        int start=k;
        int end= k==0?nums.length-1:k-1;
        while(start!=end){
            if(start==nums.length-1){
                if(nums[start]>nums[0]) return false;
                start=0;
            }
            else{
                if(nums[start]>nums[start+1]) return false;
                start++;
            }
            
        }
        if(start==0 && nums[start]<nums[nums.length-1])return false;
        else if(nums[start]<nums[start-1])return false;
        return true;
    }
}