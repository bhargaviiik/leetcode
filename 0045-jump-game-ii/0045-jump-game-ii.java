class Solution {
    public int jump(int[] nums) {
        int jumps = 0;
        int farthest = 0;
        int currEnd = 0;
        
        for (int i = 0; i < nums.length - 1; i++) {
            farthest = Math.max(farthest, i + nums[i]);
            if (i == currEnd) { // time to make a jump
                jumps++;
                currEnd = farthest;
            }
        }
        return jumps;
    }
}
