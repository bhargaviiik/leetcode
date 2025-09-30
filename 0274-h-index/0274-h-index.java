class Solution {
    public int hIndex(int[] citations) {
        int n=citations.length;
        while(n>0){
            int check=0;
            for(int i=0;i<citations.length;i++){
                if(check+(citations.length-i)<n) break;
                if(citations[i]>=n) check++;
            }
            if(check>=n) return n;
            n--;
        }
        return 0;
    }
}