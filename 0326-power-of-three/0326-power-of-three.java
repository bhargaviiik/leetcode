class Solution {
    public boolean isPowerOfThree(int n){
        return power(n);
    }
    public boolean power(int n){
        if(n<=0)return false;
        if(n==1)return true;
        if(n%3!=0)return false;
        return power(n/3);
    }
}