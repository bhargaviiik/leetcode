class Solution {
    public boolean isBipartite(int[][] graph) {
        int[] col=new int[graph.length];
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<graph.length;i++){
            if(col[i]==0){
                q.add(i);
                col[i]=1;
                while(!q.isEmpty()){
                    int curr=q.remove();
                    for(int j=0;j<graph[curr].length;j++){
                        int nextCol= col[curr]==1?2:1;
                        if(col[graph[curr][j]]==col[curr])return false;
                        if(col[graph[curr][j]]==0){
                            col[graph[curr][j]]=nextCol;
                            q.add(graph[curr][j]);
                        }
                    }
                }
            }
        }
        return true;
        
    }
    
}