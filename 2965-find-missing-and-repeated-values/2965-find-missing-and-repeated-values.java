class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n=grid.length;
        int arr[] = new int[(n*n)+1];
        int a=0,b=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                arr[grid[i][j]]++;
            }
        }
        for(int i=1;i<arr.length;i++){
            if(arr[i]==2){
                a=i;
            }
            if(arr[i]==0){
                b=i;
            }
        }
        int[] ans={a,b};
        return ans;
    }
}