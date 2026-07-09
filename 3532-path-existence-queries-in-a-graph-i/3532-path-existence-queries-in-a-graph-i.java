class Solution {
    public boolean[] pathExistenceQueries(int n, int[] nums, int maxDiff, int[][] queries) {
        boolean[] ans= new boolean[queries.length];
        int[] group = new int[n];
        int c=0;
        for(int i=1;i<nums.length;i++){
            if(Math.abs(nums[i]-nums[i-1])<=maxDiff){
                group[i]=c;
            }
            else{
                c++;
                group[i]=c;
            }
        }
        for(int i=0;i<queries.length;i++){
            int x=queries[i][0];
            int y=queries[i][1];
            if(group[x]==group[y]){
                ans[i]=true;
            }
        }
        return ans;
    }
}