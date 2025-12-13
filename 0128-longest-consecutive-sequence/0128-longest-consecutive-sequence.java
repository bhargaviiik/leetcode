class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int max=0;
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        for(int i:set){
            if(!set.contains(i-1)){
                int count=1;
                while(set.contains(++i)) count++;
                max=Math.max(max,count);
            }
        }
        return max;
    }
}