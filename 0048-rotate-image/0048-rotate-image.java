class Solution {
    public void rotate(int[][] matrix) {
        //approach 1: transpose + reverse rows
        //  1 4 7       7 4 1
        //  2 5 8  -->  8 5 2 
        //  3 6 9       9 6 3

        //transpose
        for(int i=0;i<matrix.length;i++){
            for(int j=i;j<matrix.length;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }

        //reverse rows
        for(int i=0;i<matrix.length;i++){
            int start=0;
            int end=matrix.length-1;
            while(start<end){
                int temp=matrix[i][start];
                matrix[i][start]=matrix[i][end];
                matrix[i][end]=temp;
                start++;
                end--;
            }
        }
    }
}