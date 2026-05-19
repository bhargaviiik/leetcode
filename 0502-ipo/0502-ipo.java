class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        int n=profits.length;
        int[][] projects= new int[n][2];
        for(int i=0;i<n;i++){
            projects[i][0]=capital[i];
            projects[i][1]=profits[i];
        }
        Arrays.sort(projects,(a,b)->a[0]-b[0]); //on the basis of capital in ascending
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a); //on the basis of profit
        int i=0;
        while(k-->0){
            while(i<n && projects[i][0]<=w){
                pq.add(projects[i][1]);   // we have to use projects everywhere now, bc i is on projects
                i++;
            }
            if(!pq.isEmpty()) w+=pq.poll();
        }
        return w;
    }
}