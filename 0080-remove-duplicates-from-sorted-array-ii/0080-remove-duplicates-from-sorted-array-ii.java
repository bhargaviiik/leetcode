class Solution {//not gonna use any flags inorder to write a generalized solution
    public int removeDuplicates(int[] nums) {
        int temp=1;
        int curr=1;
        int count=1;
        while(curr<nums.length){
            if(nums[curr]!=nums[curr-1]){
                count=0;
                nums[temp]=nums[curr];
                count++;
                temp++;
                curr++;
            }
            while(curr<nums.length && nums[curr]==nums[curr-1]){
                if(count<2){
                    nums[temp]=nums[curr];
                    temp++;
                    count++;
                }
                curr++;
            }
        }
        return temp;
    }
}