class Solution {
    public int countPrimes(int n) {
        if(n<3) return 0;
        if(n==3) return 1;
        boolean[] isComp = new boolean[n];
        int count=0;
        for(int i=2;i<n;i++){
            if(!isComp[i]){
                count++;
                if ((long) i * i >= n) continue; 
                for(int j=i*i;j<n;j+=i){
                    isComp[j]=true;
                }
            }
        }
        return count;
    }
}