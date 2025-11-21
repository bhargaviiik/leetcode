class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int startRow=0, endRow= matrix[0].length-1;
        int startCol=0, endCol= matrix.length-1;
        while(startRow<=endRow && startCol<=endCol){
            // top layer
            for(int j=startRow;j<=endRow;j++){
                ans.add(matrix[startCol][j]);
            }
            //right layer
            for(int i=startCol+1;i<=endCol;i++){
                ans.add(matrix[i][endRow]);
            }
            //bottom layer
            for(int j=endRow-1;j>=startRow;j--){
                if(startCol==endCol) continue;
                ans.add(matrix[endCol][j]);
            }
            //left layer
            for(int i=endCol-1;i>startCol;i--){
                if(startRow==endRow) continue;
                ans.add(matrix[i][startRow]);
            }
            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }
        return ans;
    }
}