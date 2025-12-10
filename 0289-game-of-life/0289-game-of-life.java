class Solution {
    public void gameOfLife(int[][] board) {
        //2: 0,will become 1
        //3: 1,will become 0
        int m= board.length, n=board[0].length;
        int[][] dir={{0,1},{1 ,0},{-1,0},{0,-1},{1,-1},{-1,1},{1,1},{-1,-1}};
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int curr=board[i][j];
                int count=0;
                for(int[] d:dir){
                    int x= i+d[0];
                    int y= j+d[1];
                    if(x>=0 && x<m && y>=0 && y<n){
                        if(board[x][y]==1 || board[x][y]==3) count++;
                    }
                }
                if(curr==0 && count==3){
                    board[i][j]=2; //0->1
                }
                else if(curr==1 && (count<2 || count>3)){
                    board[i][j]=3;// 1->0
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]==2){
                    board[i][j]=1;
                }
                else if(board[i][j]==3) board[i][j]=0;
            }
        }
    }
}