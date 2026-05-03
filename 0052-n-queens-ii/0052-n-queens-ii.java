class Solution {
    int count=0;
    public int totalNQueens(int n) {
        char[][] board= new char[n][n];
        for(int i=0;i<n;i++) Arrays.fill(board[i],'.');
        helper(board,0);
        return count;
    }
    void helper(char[][] board, int i){
        if(i==board.length){
            count++; 
            return;
        }
        for(int j=0;j<board.length;j++){
            if(isSafe(i,j,board)){
                board[i][j]='q';
                helper(board,i+1);
                board[i][j]='.';
            }
        }
    }
    boolean isSafe(int i,int j, char[][] board){
        for(int k=0;k<i;k++){ //column
            if(board[k][j]=='q') return false;
        }
        if(up(i,j,board)) return false;
        if(down(i,j,board))return false;
        if(right(i,j,board))return false;
        if(left(i,j,board))return false;
        return true;
    }
    boolean up(int i,int j,char[][] board){
        if(i<0 || j<0) return false;
        if(board[i][j]=='q') return true;
        if(up(i-1,j-1,board))return true;
        return false;
    }
    boolean down(int i,int j,char[][] board){
        if(i>=board.length || j<0) return false;
        if(board[i][j]=='q') return true;
        if(down(i+1,j-1,board))return true;
        return false;
    }
    boolean right(int i,int j,char[][] board){
        if(i<0 || j>=board.length) return false;
        if(board[i][j]=='q') return true;
        if(right(i-1,j+1,board))return true;
        return false;
    }
    boolean left(int i,int j,char[][] board){
        if(i>=board.length || j>=board.length) return false;
        if(board[i][j]=='q') return true;
        if(left(i+1,j+1,board))return true;
        return false;
    }
}