class Solution {
    public int countPrimes(int n) {
        if(n<3) return 0;
        List<Integer> ans = new ArrayList<>();
        for(int i=2;i<n;i++){
            boolean flag=true;
            for(int j=0;j<ans.size();j++){
                if(i%(ans.get(j))==0){flag=false; break;}
            }
            if(flag) ans.add(i);
        }
        return ans.size();
    }
}