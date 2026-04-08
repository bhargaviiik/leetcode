class Solution {
    public void moveZeroes(int[] nums) {
        int i=-1,j=-1;
        while(j<nums.length && i<nums.length){
            j++;
            while(j<nums.length && nums[j]==0) j++; //found non zero
            i++;
            if(i>=nums.length || j>=nums.length) break;
            nums[i]=nums[j];
        }
        while(i<nums.length){
            nums[i++]=0;
        }
    }
}