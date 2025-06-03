class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<=0)return false;
        if(n==1)return true; //2^0=1 but 1%2 is 1..  evry power of two will become 1 at the end..
        if(n%2!=0)return false;
        return isPowerOfTwo(n/2);
    }
}