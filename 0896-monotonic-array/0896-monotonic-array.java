class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean a =true;
        boolean b=true;
        for(int i=0;i<nums.length-1;i++){ //ascending
            if(nums[i]>nums[i+1]){
                a=false;
            }
        }
        for(int i=0;i<nums.length-1;i++){//descending
            if(nums[i]<nums[i+1]){
                b=false;
            }
        }
        return a||b;
    }
}