class Solution {
    public int numIslands(char[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        boolean visited[][] = new boolean[m][n];
        int count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]=='1' && !visited[i][j]){
                    count++;
                    dfs(m,n,i,j,grid,visited);
                }
            }
        }
        return count;
    }
    void dfs(int m, int n, int i, int j, char[][] grid, boolean[][] visited){
        if(i<0 || i>=m || j<0 || j>=n || grid[i][j]=='0'|| visited[i][j]) return;
        visited[i][j]=true;
        dfs(m,n,i+1,j,grid,visited);
        dfs(m,n,i,j+1,grid,visited);
        dfs(m,n,i-1,j,grid,visited);
        dfs(m,n,i,j-1,grid,visited);
    }
}