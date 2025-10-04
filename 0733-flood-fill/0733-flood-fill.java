class Solution {
    void helper(int i,int j,int[][] image,boolean[][] visited, int color, int origColor,int m,int n){
        if(i<0 || j<0 || i>=m || j>=n || visited[i][j] || image[i][j]!=origColor) return;
        image[i][j]=color;
        visited[i][j]=true;
        helper(i+1,j,image,visited,color,origColor,m,n);
        helper(i-1,j,image,visited,color,origColor,m,n);
        helper(i,j+1,image,visited,color,origColor,m,n);
        helper(i,j-1,image,visited,color,origColor,m,n);
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int origColor= image[sr][sc];
        int m= image.length;
        int n= image[0].length;
        boolean[][] visited = new boolean[m][n];
        helper(sr,sc,image,visited,color,origColor,m,n);
        return image;
    }
}