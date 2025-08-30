class Solution {
    public boolean searchMatrix(int [][] matrix, int target) {
        int m= matrix.length, n= matrix[0].length;
        int left=0;
        int right=m*n-1;
        while(right>=left){
            int mid=left+(right-left)/2;
            int curr=matrix[mid/n][mid%n];
            if(curr==target) return true;
            if(curr<target){
                left=mid+1;
            }
            else right=mid-1;
        }
        return false;
    }
}