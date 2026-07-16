class Solution {
    public long gcdSum(int[] nums) {
        int[] prefixGcd= new int[nums.length];
        int max=0;
        for(int i=0;i<nums.length;i++){
            max= Math.max(max,nums[i]);
            prefixGcd[i]=gcd(max,nums[i]);
        }
        Arrays.sort(prefixGcd);
        long ans=0;
        for(int i=0;i<prefixGcd.length/2;i++){
            ans+=gcd(prefixGcd[i],prefixGcd[prefixGcd.length-i-1]);
        }
        return ans;
    }
    int gcd(int a, int b){  
        if(b==0) return a;
        return gcd(b,a%b);
    }
}