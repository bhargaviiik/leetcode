class Solution {
    public boolean isPowerOfTwo(int n) {
        return n>0 && Integer.bitCount(n)==1; //0 is not a power of 2 
        //and Integer.bitCount(n) method returns the no. of 1's in binary representation of n 
    }
}