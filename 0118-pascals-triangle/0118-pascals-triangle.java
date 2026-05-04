class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans= new ArrayList<>();
        List<Integer> list= new ArrayList<>();
        list.add(1);
        ans.add(list);
        for(int i=1;i<numRows;i++){
            List<Integer> curr= new ArrayList<>();
            List<Integer> par= ans.get(ans.size()-1);
            curr.add(1);
            for(int j=0;j<=par.size()-2;j++){
                curr.add(par.get(j)+par.get(j+1));
            }
            curr.add(1);
            ans.add(curr);
        }
        return ans;
    }
}