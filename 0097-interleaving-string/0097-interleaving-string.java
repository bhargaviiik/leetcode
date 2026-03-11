class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        if(s1.length()+s2.length()!=s3.length()) return false; 
        Boolean[][] dp= new Boolean[s1.length()+1][s2.length()+1];
        return helper(s3,s1,s2,0,0,0,dp);  //i for si and j for s2
    }
    boolean helper(String s,String s1,String s2,int i,int j,int k,Boolean [][] dp){
        if(k>=s.length()){  //base condition
            if(i==s1.length() && j==s2.length()) return true;   //if it is formed by interleaving of both
            return false;
        }
        if(dp[i][j]!=null) return dp[i][j];
        char curr=s.charAt(k);
        if(i<s1.length() && s1.charAt(i)==curr) if(helper(s,s1,s2,i+1,j,k+1,dp))return true;
        if(j<s2.length() && s2.charAt(j)==curr) if(helper(s,s1,s2,i,j+1,k+1,dp))return true;
        return dp[i][j]=false;
    }  //it is compulsory for both strings to be used completely duh
}