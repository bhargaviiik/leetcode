class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->{ //a and b are obv gonna be int[]
            return (b[0]*b[0]+b[1]*b[1]) - (a[0]*a[0]+a[1]*a[1]); 
        });
        for(int i=0;i<points.length;i++){
            pq.offer(points[i]);
        }
        for(int i=0;pq.size()>k;i++){
            pq.poll();//poll doesnt take any argument
        }
        int[][] arr=new int[k][2];
        for(int i=0;i<k;i++){
            arr[i]=pq.poll();
        }
        return arr;
    }
}