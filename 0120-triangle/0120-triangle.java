class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        Integer[][] dp = new Integer[triangle.size()][triangle.get(triangle.size()-1).size()];
        return helper(triangle,0,0,dp);
    }
    int helper(List<List<Integer>> triangle,int i,int j,Integer[][] dp){
        if(i>=triangle.size()) return 0;
        if(dp[i][j]!=null) return dp[i][j];
        int curr=triangle.get(i).get(j);
        int a= helper(triangle,i+1,j,dp);
        int b= helper(triangle,i+1,j+1,dp);
        return dp[i][j]=curr+Math.min(a,b);
    }
}