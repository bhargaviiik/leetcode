class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> ans= new ArrayList<>();
        ans.add(1);
        for(int i=0;i<rowIndex;i++){
            int size= ans.size();
            for(int j=0;j<size-1;j++){
                ans.set(j,ans.get(j)+ans.get(j+1));
            }
            ans.add(0,1);
        }
        return ans;
    }
}