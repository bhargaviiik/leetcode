class Solution {
    public int singleNumber(int[] nums) {
        int[] map=new int[30001];
        for(int i=0;i<nums.length;i++){
            map[nums[i]]++;
        }
        for(int i=0;i<map.length;i++){
            if(map[i]==1){
                return i;
            }
        }
        return -1;
    }
}