class Solution {
    public void setZeroes(int[][] matrix) {
        // 1,1  
        ArrayList<int[]> list= new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    list.add(new int[]{i,j});
                }
            }
        }
        while(!list.isEmpty()){
            int[] curr=list.remove(0);
            setRow(matrix,curr[0]);
            setCol(matrix, curr[1]);
        }
    }
    void setRow(int[][] matrix, int idx){
        for(int i=0;i<matrix[0].length;i++){
            matrix[idx][i]=0;
        }
    }
    void setCol(int[][] matrix, int idx){
        for(int i=0;i<matrix.length;i++){
            matrix[i][idx]=0;
        }
    }
}