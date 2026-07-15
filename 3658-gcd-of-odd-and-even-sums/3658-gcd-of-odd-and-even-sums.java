class Solution {
    public int gcdOfOddEvenSums(int n) {
        int c=0;
        int even=0;
        int odd=0;
        for(int i=0;i<n;i++){
            even+=c;
            odd+=(c+1);
        }
        return gcd(even,odd);
    }
    public int gcd(int a, int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
}