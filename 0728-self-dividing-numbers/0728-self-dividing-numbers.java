class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans= new ArrayList<>();
        for(int i=left;i<=right;i++){
            int n=i;
            boolean yes=true;
            while(n!=0){
                int dig=n%10;
                if(dig==0 || i%dig!=0){yes=false; break;}
                n=n/10;
            }
            if(yes) ans.add(i);
        }
        return ans;
    }
}