class Solution {
    int[][] dp;
    public boolean stoneGame(int[] piles) {
        int n=piles.length;
        dp = new int[n][n];
        for(int[]  row:dp) Arrays.fill(row,-1);
        helper(piles,0,n-1,true);
        int stones= Math.max(dp[0][n-1],dp[n-1][0]);
        return stones>0;
    }
    int helper(int[] piles, int i, int j,boolean flag){
        if(Math.abs(i-j)==1){  //base case
            return Math.abs(piles[i]-piles[j]);
        }
        if(flag && dp[i][j]!=-1) return dp[i][j];
        else if(!flag && dp[j][i]!=-1) return dp[j][i];
        int opt1=helper(piles,i+1,j,true);
        int opt2=helper(piles,i,j-1,false);
        int stones=Math.max(opt1, opt2)+Math.abs(piles[i]-piles[j]);;
        if(flag){
            dp[i][j]=stones;
        }
        else{
            dp[j][i]=stones;
        }
        return stones;
    }
}