class Solution {
    int max=0;
    public int maximalSquare(char[][] matrix) {
        int[][] dp = new int[matrix.length][matrix[0].length];
        for(int[] row:dp) Arrays.fill(row,-1);
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]=='1') helper(matrix,i,j,dp);
            }
        }
        return max*max;
    }
    int helper(char[][] matrix,int i, int j,int[][] dp){
        if(i>=matrix.length || j>=matrix[0].length) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        if(matrix[i][j]!='1') return 0;
        int a=helper(matrix,i,j+1,dp);
        int b=helper(matrix,i+1,j,dp);
        int c=helper(matrix,i+1,j+1,dp);
        int ans=1+Math.min(Math.min(a,b),c);  //bc if he is 1, he atleast have to return his 1
        max=Math.max(max,ans);
        return dp[i][j]= ans;
    }
}
