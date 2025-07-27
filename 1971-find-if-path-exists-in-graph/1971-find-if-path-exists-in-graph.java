class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        if(n==1|| source==destination)return true;
        for(int i=0;i<n-1;i++){
            if(edges[i][0]==source){
                if(path(edges,edges[i][1],destination))return true;
            } 
        }
        return false;
    }
    boolean path(int[][] edges,int source,int destination){
        if(source==destination)return true;
        for(int i=0;i<edges.length;i++){
            if(edges[i][0]==source) return path(edges,edges[i][1],destination);
        }
        return false;
    }
}