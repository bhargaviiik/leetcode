class Solution {
    boolean canSwim(int x,int y,int mid,int[][] grid,int[][] directions,boolean[][] visited){
        if(x==grid.length-1 && y==grid[0].length-1) return true;
        visited[x][y]=true;
        for(int[] dir: directions){
            int x_= x+dir[0];
            int y_ = y+dir[1];
            if(x_>=0 && y_>=0 && x_<grid.length && y_<grid[0].length && !visited[x_][y_] && grid[x_][y_]<=mid){
                if(canSwim(x_,y_,mid,grid,directions,visited)) return true;
            }
        }
        return false;
    }
    public int swimInWater(int[][] grid) {
        int n=grid.length;
        int si=grid[0][0];
        int ei=(n*n)-1;
        int[][] directions= {{0,1},{1,0},{0,-1},{-1,0}};
        
        while(si<=ei){
            int mid= si+(ei-si)/2;
            boolean[][] visited= new boolean[grid.length][grid[0].length];
            if(canSwim(0,0,mid,grid,directions,visited)){
                ei=mid-1;
            }
            else si=mid+1;
        }
        return si;
    }
}