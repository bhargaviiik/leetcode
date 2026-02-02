class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(candidates,target,ans,new ArrayList<>(),0);
        return ans;
    }
    void helper(int[] candidates,int target, List<List<Integer>> ans, List<Integer> list,int idx){
        if(target==0){
            ans.add(new ArrayList<>(list));
            return;
        }
        if(target<0) return;
        for(int i=idx;i<candidates.length;i++){
            list.add(candidates[i]);
            helper(candidates, target-candidates[i],ans,list,i);
            list.remove(list.size()-1);
        }
    }
}