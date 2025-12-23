class Solution {
    public int[][] merge(int[][] intervals) {
        int n=intervals.length, m=intervals[0].length;
        int[][] ans= new int[n][m];
        for(int i=1;i<intervals.length;i++){
            int[] curr= intervals[i];
            int prev=i-1;
            while(prev>=0 && curr[0]<intervals[prev][0]) intervals[prev+1]=intervals[prev--];
            intervals[prev+1]=curr;
        }
        int j=0;
        ans[0]=intervals[0];
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]<=ans[j][1]){
                ans[j][1]=intervals[i][1];
            }
            else{
                j++;
                ans[j]=intervals[i];
            }
        }
        int[][] ans2= new int[j+1][2];
        for(int i=0;i<ans2.length;i++){
            ans2[i]=ans[i];
        }
        return ans2;
    }
}