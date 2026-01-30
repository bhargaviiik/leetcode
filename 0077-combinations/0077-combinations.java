class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans= new ArrayList<>();
        helper(n,k,ans,new ArrayList<>(),1);
        return ans;
    }
    void helper(int n,int k,List<List<Integer>> ans, List<Integer> list, int i){
        if(list.size()==k){
            ans.add(new ArrayList<>(list));
            return;
        }
        if(i>n) return;
        list.add(i);
        helper(n,k,ans,list,i+1);
        list.remove(list.size()-1);
        helper(n,k,ans,list,i+1);
    }
}