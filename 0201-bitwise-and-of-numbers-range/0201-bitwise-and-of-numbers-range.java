class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        //find comman prefix of left and right
        int shiftCount=0;
        while(left!=right){
            left>>=1;
            right>>=1;
            shiftCount++;
        }
        return left<<shiftCount;
    }
}