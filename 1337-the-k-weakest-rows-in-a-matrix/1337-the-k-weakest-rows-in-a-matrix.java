class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>((i,j)->{ //i,j are indices or nested arr's
            int[] a1=mat[i],a2=mat[j];
            int sum1=0,sum2=0;
            for(int a:a1)sum1+=a;
            for(int a:a2)sum2+=a;
            if(sum1==sum2)return i-j;
            return sum1-sum2;   //we wanna priortize i then value should be -ve
        });
        for(int i=0;i<mat.length;i++)pq.offer(i);
        int[] arr=new int[k];
        for(int i=0;i<k;i++)arr[i]=pq.poll();
        return arr;
    }
}