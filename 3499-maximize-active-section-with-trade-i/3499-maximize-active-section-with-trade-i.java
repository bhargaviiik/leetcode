class Solution {
    public int maxActiveSectionsAfterTrade(String s) {
        int c=0;
        int n=s.length();
        List<Integer> zeros= new ArrayList<>();
        int i=0;
        while(i<n){
            int idx=i;
            char start =s.charAt(i);
            while(++i<n && s.charAt(i)==start);
            if(start=='0') zeros.add(i-idx);
            else c+= (i-idx);
        }
        int best=0;
        int m=zeros.size();
        for(i=0;i<m-1;i++){
            best= Math.max(best,zeros.get(i)+zeros.get(i+1));
        }
        return c+best;
    }
}