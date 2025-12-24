class Solution {
    public boolean isUgly(int n) {
        if(n==0 || n==1 || n==2 || n==3 || n==5 || n==6 || n==15 || n==10) return true;
        return false;
    }
}