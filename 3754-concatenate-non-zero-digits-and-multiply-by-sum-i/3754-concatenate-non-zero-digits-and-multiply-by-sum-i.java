class Solution {
    public long sumAndMultiply(int n) {
        long sum=0, x=0;
        int i=0;
        while(n!=0){
            int num= n%10;
            if(num!=0){
                x=x+num*(int)Math.pow(10,i);
                sum+=num;
                i++;
            }
            n=n/10;
        }
        return x*sum;
    }
}