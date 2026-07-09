class Solution {
    public boolean[] pathExistenceQueries(int n, int[] nums, int maxDiff, int[][] queries) {
        boolean[] ans= new boolean[queries.length];
        DSU dsu = new DSU(n-1);
        for(int i=1;i<nums.length;i++){
            if(Math.abs(nums[i]-nums[i-1])<=maxDiff){
                dsu.unionBySize(i,i-1);
            }
        }
        for(int i=0;i<queries.length;i++){
            int x= queries[i][0];
            int y= queries[i][1];
            int pu= dsu.findParent(x);
            int pv= dsu.findParent(y);
            if(pu==pv){
                ans[i]=true;
            }
        }
        return ans;
    }
    class DSU{
        int[] parent;
        int[] size;
        DSU(int n){
            parent = new int[n+1];
            size = new int[n+1];
            for(int i=0;i<=n;i++){
                parent[i]=i;
                size[i]=1;
            }
        }
        int findParent(int i){
            if(parent[i]==i) return i;
            return parent[i]= findParent(parent[i]);
        }
        void unionBySize(int u, int v){
            int pu= findParent(u);
            int pv= findParent(v);
            if(pu==pv) return;
            if(size[pu]<size[pv]){
                parent[pu]=pv;
                size[pv]+=size[pu];
            }
            else{
                parent[pv]=pu;
                size[pu]+=size[pv];
            }
        }
    }
}