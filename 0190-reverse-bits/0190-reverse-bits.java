class Solution {
    public int reverseBits(int n) {
        StringBuilder num= new StringBuilder();
        while(n!=0){
            int rem= n%2;
            n=n/2;
            num.append(rem);
        }
        for(int i=num.length()+1;i<=32;i++) num.append('0');
        int ans=0,p=0;
        for(int i=num.length()-1;i>=0;i--){
            ans+=(num.charAt(i)-'0')*((int)Math.pow(2,p++));
        }
        return ans;
    }
}