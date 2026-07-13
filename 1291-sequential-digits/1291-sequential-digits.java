class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> ans = new ArrayList<>();
        String template="123456789";
        String l = String.valueOf(low);
        String h = String.valueOf(high);
        for(int i=l.length();i<=h.length();i++) helper(0,ans,template,high,low,i);
        return ans;
    }
    void helper(int i,List<Integer> ans, String template, int high, int low,int window){
        if(i+window>template.length()) return;
        String subs= template.substring(i,i+window);
        int num= Integer.parseInt(subs);
        if(num>= low && num<=high) ans.add(num);
        helper(i+1,ans,template,high,low,window);
    }
}