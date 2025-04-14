class Solution {
    public boolean isPalindrome(int x) {
        int a=x;//orignal
        int y=0;//reversed
        while(x>0){
            y= (x%10)+(y*10);
            x=x/10;
           
        }
        if(a==y){
            return true ;
        }else return false;

        
    }
}