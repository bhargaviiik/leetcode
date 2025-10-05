class Solution {
    void dfs(int[][] heights,boolean[][] visited,int[][] directions,int x, int y){
        visited[x][y] = true;
        int curr=heights[x][y];
        for(int[] dir:directions){
            int x2= x+dir[0];
            int y2=y+dir[1];
            if(x2>=0 && x2<heights.length&& y2>=0 && y2<heights[0].length && !visited[x2][y2] && heights[x2][y2]>=curr){
                dfs(heights,visited,directions,x2,y2);
            }
        }
    }
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        List<List<Integer>> ans = new ArrayList<>();
        int m = heights.length;
        int n= heights[0].length;
        boolean[][] atlantic = new boolean[m][n];
        boolean[][] pacific = new boolean[m][n];
        int[][] directions= {{-1,0},{0,-1},{1,0},{0,1}};

        for(int i=0;i<m;i++){
            dfs(heights,pacific,directions,i,0);
            dfs(heights,atlantic,directions,i,n-1);
        }
        for(int i=0;i<n;i++){
            dfs(heights,pacific,directions,0,i);
            dfs(heights,atlantic,directions,m-1,i);
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(atlantic[i][j] && pacific[i][j]){
                    ArrayList<Integer> list= new ArrayList<>();
                    list.add(i);
                    list.add(j);
                    ans.add(list);
                }
            }
        }
        return ans;
    }
}