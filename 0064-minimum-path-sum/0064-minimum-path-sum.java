class Solution {
    public int minPathSum(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int[][] dp= new int[n][m];
        for(int[] row:dp) Arrays.fill(row,-1);
        return helper(grid,0,0,dp);
    }
    int helper(int[][] grid,int i,int j,int[][] dp){
        if(i==grid.length-1 && j==grid[0].length-1) return grid[i][j];
        if(i>=grid.length || j>=grid[0].length) return Integer.MAX_VALUE;
        if(dp[i][j]!=-1) return dp[i][j];
        int a=helper(grid,i,j+1,dp);
        int b=helper(grid,i+1,j,dp);
        return dp[i][j]=Math.min(a,b)+grid[i][j];
    }
}