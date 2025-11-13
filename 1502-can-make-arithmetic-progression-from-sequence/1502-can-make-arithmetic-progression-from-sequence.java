class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        //insertion sort
        for(int i=1;i<arr.length;i++){
            int curr=arr[i];
            int j=i-1;
            while(j>=0 && curr<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=curr;
        }
        int diff= arr[1]-arr[0];
        for(int i=2;i<arr.length;i++){
            if(arr[i]-arr[i-1]!=diff) return false;
        }
        return true;
    }
}