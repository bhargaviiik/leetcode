class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans= new ArrayList<>();
        helper(n,new StringBuilder(),0,0,ans);
        return ans;
    }
    void helper(int n, StringBuilder str,int o, int c, List<String> ans){
        if(str.length()==(n*2)){
            ans.add(str.toString());
            return;
        }
        if(o==c){
            str.append('(');
            helper(n,str,o+1,c,ans);
            str.deleteCharAt(str.length()-1);
        }
        else if(o==n){
            str.append(')');
            helper(n,str,o,c+1,ans);
            str.deleteCharAt(str.length()-1);
        }
        else{
            str.append('(');
            helper(n,str,o+1,c,ans);
            str.deleteCharAt(str.length()-1);
            str.append(')');
            helper(n,str,o,c+1,ans);
            str.deleteCharAt(str.length()-1);
        }
    }
}