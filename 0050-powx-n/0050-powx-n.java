class Solution {
    public double myPow(double x, int n) {
        long nn= n;      //negative range has one extra number than positive so converting to long
        double ans=1.0;
        if(n<0) nn*=-1;  //if negative convert to positive
        while(nn>0){
            if(nn%2==1){ //odd
                ans*=x;
                nn=nn-1;
            }
            x=x*x;
            nn=nn/2;
        }
        if(n<0) return 1/ans;
        return ans;
    }
}