class Solution {
    public boolean isBalanced(String num) {
        int sum=0;
        for(int i=0;i<num.length();i+=2){
            sum+=num.charAt(i)-'0';
            if(i+1<num.length())sum-=num.charAt(i+1)-'0';
        }
        if(sum==0) return true;
        return false;
    }
}