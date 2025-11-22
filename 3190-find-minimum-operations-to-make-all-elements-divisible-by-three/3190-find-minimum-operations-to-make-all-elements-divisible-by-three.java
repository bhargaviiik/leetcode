class Solution {
    public int minimumOperations(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            int num= nums[i];
            if(num%3==0) continue;
            int a= num%3;
            int b=3-a;
            count+=Math.min(a,b);
        }
        return count;
    }
}