class Solution {
    public long maxAlternatingSum(int[] nums) {
        //even: add->(maximize)   odd: substract->(minimize)
        long ans=0;
        for(int i=0;i<nums.length;i++){
            nums[i]= nums[i]*nums[i];
        }
        Arrays.sort(nums);
        int a=0;
        int b= nums.length-1;
        for(int i=0;i<nums.length;i++){
            if(i==0 || i%2==0){ //even
                ans+= nums[b];
                b--;
            }
            else{
                ans-=nums[a];
                a++;
            }
        }
        return ans;
    }
}