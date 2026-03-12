class Solution {
    public int minDistance(String word1, String word2) {
        int[][] dp= new int[word1.length()][word2.length()];
        for(int[] row:dp) Arrays.fill(row,-1);
        return helper(word1, word2,0,0,dp);
    }
    int helper(String word1, String word2,int i,int j,int[][] dp){
        if(i<word1.length() && j>=word2.length()) return word1.length()-i;
        if(i>=word1.length() && j<word2.length()) return word2.length()-j;
        if(i>=word1.length() && j>=word2.length()) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        if(word1.charAt(i)==word2.charAt(j)) return dp[i][j]=helper(word1,word2,i+1,j+1,dp);
        else{
            int insert=helper(word1,word2,i,j+1,dp)+1;
            int delete=helper(word1,word2,i+1,j,dp)+1;
            int replace=helper(word1,word2,i+1,j+1,dp)+1;
            return dp[i][j]=Math.min(Math.min(insert,delete),replace);
        }
    }
}