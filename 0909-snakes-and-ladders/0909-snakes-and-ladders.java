class Solution {
    public int snakesAndLadders(int[][] board) {
        int n= board.length;
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[(n*n)+1];
        q.offer(1);
        visited[1]=true;
        int moves=0;
        while(!q.isEmpty()){
            int size= q.size();
            for(int i=0;i<size;i++){
                int curr= q.poll();
                if(curr==n*n)return moves;
                for(int j=1;j<=6;j++){
                    int next=curr+j;
                    if(next>n*n) break;

                    int[] xy= get_coord(next,n);
                    int x=xy[0];
                    int y=xy[1];

                    if(board[x][y]!=-1){
                        next=board[x][y];
                    }
                    if(!visited[next]){
                        visited[next]=true;
                        q.offer(next);
                    }
                }
            }
            moves++;  //one level completed
        }
        return -1;
    }
    public int[] get_coord(int num,int n){
        int i= n-1-(num-1)/n;          //num-1 because, s&l is 1-index based and our arr is 0 based...
        int j=(num-1)%n;
        if((n-i)%2==0) j=n-1-j;
        return new int[]{i,j};      
    }
}