class Solution {
    class Pair{
        int i;
        int j;
        Pair(int i,int j){
            this.i=i;
            this.j=j;
        }
    }
    void add(Queue<Pair> q,int i,int j,boolean vis[][],int mat[][]){
        if(vis[i][j]==false && mat[i][j]==1){
            q.add(new Pair(i,j));
            vis[i][j]=true;
        } 
    }
    
    public int orangesRotting(int[][] mat) {
        // Code here
        boolean[][] vis = new boolean[mat.length][mat[0].length];
        Queue<Pair> q=new LinkedList<>();
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                if(mat[i][j]==0 || mat[i][j]==2){
                    vis[i][j]=true;
                }
                if(mat[i][j]==2) q.add(new Pair(i,j));
            }
        }
        q.add(null);
        int c=-1;
        while(!q.isEmpty()){
            Pair curr=q.remove();
            if(curr==null){
                c++;
                if(q.size()!=0){
                    q.add(null);
                }
                continue;
            }
            int i=curr.i,j=curr.j;
            if(i!=mat.length-1)add(q,i+1,j,vis,mat);
            if(i!=0) add(q,i-1,j,vis,mat);
            if(j!=mat[0].length-1) add(q,i,j+1,vis,mat);
            if(j!=0) add(q,i,j-1,vis,mat);
        }
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                if(!vis[i][j]) return -1;
            }
        }
        return c;
    }
}