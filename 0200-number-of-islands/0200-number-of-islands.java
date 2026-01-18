class Solution {
    public int numIslands(char[][] grid) {
        int n= grid.length;
        int m= grid[0].length;
        boolean[][] island= new boolean[n][m];
        int count=0;
        int[][] dir={{0,1},{1,0},{-1,0},{0,-1}};
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]=='1' && !island[i][j]){ //new land found
                    count++;
                    Queue<int[]> q = new LinkedList<>();
                    q.add(new int[]{i,j});
                    island[i][j]=true;
                    while(!q.isEmpty()){  //until its empty we check for its neighbours 
                        int[] curr=q.poll();
                        int x= curr[0];
                        int y= curr[1];
                        for(int d[]:dir){
                            int x_=x+d[0];
                            int y_=y+d[1];
                            if(x_>=0 && y_>=0 && x_<n && y_<m && grid[x_][y_]=='1' && !island[x_][y_]) {
                                q.add(new int[]{x_,y_}); 
                                island[x_][y_]=true;
                            }
                        }
                        
                    }
                }
            }
        }
        return count;
    }
}