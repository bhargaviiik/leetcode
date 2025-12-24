class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> ans= new ArrayList<>();
        if(intervals.length==0){
            int[][] arr = new int[1][2];
            arr[0]=newInterval;
            return arr;
        }
        for(int i=0;i<intervals.length;i++){
            if(isOverlap(intervals[i],newInterval)){
                int[] arr = new int[2];
                arr[0]=Math.min(intervals[i][0],newInterval[0]);
                arr[1]=Math.max(intervals[i][1],newInterval[1]);
                newInterval=arr;
            }
            else ans.add(intervals[i]);
        }
        if(ans.size()==0) ans.add(newInterval);
        else{
            for(int i=0;i<ans.size();i++){
                if(newInterval[0]<ans.get(i)[0]){
                    ans.add(i,newInterval);
                    break;
                }
                if(i==ans.size()-1){
                    ans.add(newInterval);
                    break;
                }
            }
        }
        int[][] result = ans.toArray(new int[ans.size()][]);
        return result;
    }
    boolean isOverlap(int[] a, int[] b){return (((a[0]<=b[0]) && (a[1]>=b[0])) || ((b[0]<=a[0]) && (b[1]>=a[0])));}
}