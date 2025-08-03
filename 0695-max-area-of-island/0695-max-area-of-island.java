class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        boolean[][] vis= new boolean[grid.length][grid[0].length];
        int maxArea=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]==1 && vis[i][j]==false){
                    Queue<int[]> q=new LinkedList<>();
                    q.add(new int[]{i,j});
                    vis[i][j]=true;
                    int c=0;
                    while(!q.isEmpty()){
                        int[] curr=q.remove();
                        c++;
                        int k=curr[0],l=curr[1];
                        if(k!=0 && grid[k-1][l]==1 && vis[k-1][l]==false){
                            q.add(new int[]{k-1,l});
                            vis[k-1][l]=true;
                        }
                        if(k!=grid.length-1 && grid[k+1][l]==1 && vis[k+1][l]==false){
                            q.add(new int[]{k+1,l});
                            vis[k+1][l]=true;
                        } 
                        if(l!=0 && grid[k][l-1]==1 && vis[k][l-1]==false){
                            q.add(new int[]{k,l-1});
                            vis[k][l-1]=true;
                        } 
                        if(l!=grid[0].length-1 && grid[k][l+1]==1 && vis[k][l+1]==false){
                            q.add(new int[]{k,l+1});
                            vis[k][l+1]=true;
                        } 
                    }
                    maxArea=Math.max(maxArea,c);
                }
                
            }
        }
        return maxArea;
    }
}