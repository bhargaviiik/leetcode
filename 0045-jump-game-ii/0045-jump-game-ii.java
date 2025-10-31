class Solution {
    public int jump(int[] nums) {
        int curr =0, farthest=0,jumps=0;
        for(int i=0;i<nums.length;i++){
            if(i==nums.length-1) return jumps;
            farthest= Math.max(farthest,nums[i]+i);
            if(i==curr){
                jumps++;
                curr=farthest;
            }   
        }
        return jumps;
    }
}