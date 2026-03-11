class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        if(s1.length() + s2.length() != s3.length()) return false; //both s1 and s2 should be used completely
        Boolean[][] dp = new Boolean[s1.length()+1][s2.length()+1]; //wrapper class is used instead of primitive
        return helper(s3, s1, s2, 0, 0, dp);
    }

    boolean helper(String s, String s1, String s2, int i, int j, Boolean[][] dp){
        if(i == s1.length() && j == s2.length()) return true;
        if(dp[i][j] != null) return dp[i][j];
        int k = i + j;
        char curr = s.charAt(k);
        boolean ans = false;
        if(i < s1.length() && s1.charAt(i) == curr) ans = helper(s, s1, s2, i+1, j, dp);
        if(!ans && j < s2.length() && s2.charAt(j) == curr) ans = helper(s, s1, s2, i, j+1, dp);
        return dp[i][j] = ans;
    }
}