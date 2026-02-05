class Solution {
    public boolean exist(char[][] board, String word) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==word.charAt(0)){
                    if(helper(board,word,i,j,0))return true;
                }
            }
        }
        return false;
    }
    boolean helper(char[][] board,String word, int i, int j,int c){
        if(c==word.length()) return true;
        if(i<0 || i>=board.length || j<0 || j>=board[0].length || board[i][j]=='.' || word.charAt(c)!=board[i][j]) return false;
        char orig=board[i][j];
        board[i][j]='.';
        if(helper(board,word,i+1,j,c+1))return true;
        if(helper(board,word,i,j+1,c+1))return true;
        if(helper(board,word,i-1,j,c+1))return true;
        if(helper(board,word,i,j-1,c+1))return true;
        board[i][j]=orig;
        return false;
    }
}