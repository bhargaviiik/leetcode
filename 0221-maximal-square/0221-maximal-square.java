class Solution {
    public int maximalSquare(char[][] matrix) {
        int[][] dp = new int[matrix.length][matrix[0].length];
        int max=0;
        for(int i=1;i<matrix.length;i++){
            for(int j=1;j<matrix[0].length;j++){
                if(matrix[i][j]=='1'){
                    dp[i][j]=1+ Math.min(dp[i-1][j-1],Math.min(dp[i-1][j],dp[i][j-1]));
                    max=Math.max(max,dp[i][j]);
                }

            }
        }
        if(max==0){
            for(int i=0;i<matrix.length;i++) if(matrix[i][0]=='1') return 1;
            for(int i=0;i<matrix[0].length;i++) if(matrix[0][i]=='1') return 1;
            return 0;
        }
        return max*max;
    }
}