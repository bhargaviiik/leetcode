class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i=0;i<matrix.length;i++){
            int si=0,ei=matrix[0].length-1;
            while(si<=ei){
                int mid=si+(ei-si)/2;
                if(matrix[i][mid]==target) return true;
                else if(matrix[i][mid]<target) si=mid+1;
                else ei=mid-1;
            }
        }
        return false;
    }
}