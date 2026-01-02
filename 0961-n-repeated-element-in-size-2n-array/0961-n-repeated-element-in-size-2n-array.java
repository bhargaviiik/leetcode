class Solution {
    public int repeatedNTimes(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int n= nums.length;
        for(int i=0;i<(n)/2;i++){
            if(set.contains(nums[i])) return nums[i];
            set.add(nums[i]);
            int ele= nums[n-i-1];
            if(set.contains(ele)) return ele;
            set.add(ele);
        }
        return -1;
    }
}