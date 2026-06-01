class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a,b)->Integer.compare(a[1], b[1]));
        int prev=0;
        int ans=0;
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]<intervals[prev][1]){
                ans++;  //this interval has to be removed
            }
            else{
                prev=i;   // so the previous for upcoming intervals should becomes the one currently executing
            }
        }
        return ans;
    }
}