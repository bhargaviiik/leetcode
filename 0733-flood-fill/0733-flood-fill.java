class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if (image[sr][sc] == color) return image;
        
        int m=image.length;
        int n=image[0].length;
        Queue<int[]> q = new LinkedList<>();
        boolean visited[][] = new boolean[m][n];
        int orignalColor= image[sr][sc];
        q.add(new int[]{sr,sc});
        int[][] directions = {{0,1},{1,0},{0,-1},{-1,0}};
        while(!q.isEmpty()){
            int[] curr=q.poll();
            int x= curr[0];
            int y=curr[1];
            image[x][y]=color;
            visited[x][y]=true;
            for(int[] dir:directions){
                int x2=x+ dir[0];
                int y2=y+ dir[1];
                if(x2>=0 && y2>=0 && x2<m && y2<n && !visited[x2][y2] && image[x2][y2]==orignalColor){
                    q.add(new int[]{x2,y2});
                }
            }
        }
        return image;
    }
}