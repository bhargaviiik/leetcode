class Solution {
    public int longestConsecutive(int[] nums) {
        // 0 <= nums.length <= 10^5
        // -10^9 <= nums[i] <= 10^9
        if(nums.length==0) return 0;
        Arrays.sort(nums);
        int count=0;
        int max=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){  //duplicates
                continue;  //skip
            }
            else if(nums[i]==nums[i-1]+1){
                count++;
            }
            else{
                max=Math.max(max,count);
                count=0;
            }
        }
        max=Math.max(max,count);
        return max+1;
    }
}