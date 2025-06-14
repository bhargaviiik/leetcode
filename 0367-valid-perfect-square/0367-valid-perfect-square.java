class Solution {
    public boolean isPerfectSquare(int num) {
        long i=0,j=num,mid=0,ans=0;
        while(i<=j){//less than EQUAL to
            mid=(i+j)/2;
            ans=mid*mid;
            if(ans==num)return true;
            if(ans<num)i=mid+1;
            else j=mid-1;
        }
        return false;
    }
}