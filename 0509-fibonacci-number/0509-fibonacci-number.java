class Solution {
    public int fib(int n) {
        int[] arr= new int[n+1];
        return helper(n,arr);
    }
    int helper(int n,int[] arr){
        if(n==0|| n==1) return n;
        if(arr[n]!=0) return arr[n];
        arr[n]=fib(n-1)+fib(n-2);
        return arr[n];
    }
}