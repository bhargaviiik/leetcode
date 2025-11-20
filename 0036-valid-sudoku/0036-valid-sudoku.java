class Solution {
    public boolean isValidSudoku(char[][] board) {
        // HashSet approach
        HashSet<String> set = new HashSet<>();
        for(int i=0;i<=8;i++){
            for(int j=0;j<=8;j++){
                if(board[i][j]=='.') continue;
                int idx= (i/3)*3+j/3;
                if(set.contains(board[i][j]+"in row"+i)) return false;
                if(set.contains(board[i][j]+"in col"+j)) return false;
                if(set.contains(board[i][j]+"in block"+idx)) return false;
                set.add(board[i][j]+"in row"+i);
                set.add(board[i][j]+"in col"+j);
                set.add(board[i][j]+"in block"+idx);
            }
        }
        return true;
    }
}