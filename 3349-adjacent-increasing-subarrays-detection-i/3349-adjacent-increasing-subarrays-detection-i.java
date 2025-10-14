class Solution {
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        if(k==1) return true;
        int count=1;
        for(int i=1;i<nums.size();i++){
            if(i+k<nums.size() && nums.get(i)>nums.get(i-1) && nums.get(i+k)>nums.get(i+k-1)){
                count++;
                if(count==k) return true;
            }else{
                count=1;
            }
        }
        return false;
    }
}