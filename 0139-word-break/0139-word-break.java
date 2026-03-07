class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        HashSet<String> set = new HashSet<>();
        int[] dp= new int[s.length()+1];
        Arrays.fill(dp,2);
        for(String str:wordDict){
            set.add(str);
        }
        return helper(s,set,0,dp)==1;
    }
    int helper(String s,HashSet<String> set,int i,int[] dp){
        if(i>=s.length()){
            return 1; //true
        }
        if(dp[i]!=2) return dp[i];
        for(int j=i;j<s.length();j++){
            String curr= s.substring(i,j+1);
            if(set.contains(curr)){
                dp[j+1]=helper(s,set,j+1,dp);
                if(dp[j+1]==1)return 1;
            }
        }
        return 0;
    }
    //We never call helper for indexes that aren't valid cut points produced by the recursion.
}