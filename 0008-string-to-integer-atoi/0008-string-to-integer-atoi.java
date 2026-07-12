class Solution {
    public int myAtoi(String s) {
        int ans=0;
        int sign=1;
        int n= s.length();
        int i=0;
        while(i<n && s.charAt(i)==' ') i++;
        if(i>=n) return ans;
        if(s.charAt(i)=='-'){
            sign*=-1;
            i++;
        }
        else if(s.charAt(i)=='+') i++;
        while(i<n && s.charAt(i)=='0')i++;
        while(i<n && (s.charAt(i)-'0')>=0 && (s.charAt(i)-'0')<=9){
            int digit=s.charAt(i)-'0';
            if((Integer.MAX_VALUE-digit)/10<ans){  //checking for overflow
                return sign==-1?Integer.MIN_VALUE:Integer.MAX_VALUE;
            }
            ans*=10;
            ans+=digit;
            i++;
        }
        return ans*sign;
    }
}