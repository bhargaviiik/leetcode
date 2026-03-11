class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int n=obstacleGrid.length;
        int m=obstacleGrid[0].length;
        int[][] dp= new int[n][m];
        boolean flag=false;
        for(int i=0;i<n;i++){
            if(obstacleGrid[i][0]==1) flag=true;
            if(flag) break; //everything afterwards will be zero
            else dp[i][0]=1;
        }
        flag=false;
        for(int i=0;i<m;i++){
            if(obstacleGrid[0][i]==1) flag=true;
            if(flag) break; // everything afterwards will be zero
            else dp[0][i]=1;
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(obstacleGrid[i][j]==1) dp[i][j]=0;
                else dp[i][j]=dp[i][j-1]+dp[i-1][j];
            }
        }
        return dp[n-1][m-1];
    }
}