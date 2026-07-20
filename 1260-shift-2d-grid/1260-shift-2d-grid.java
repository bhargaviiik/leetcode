class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        int n=grid.length;
        int m=grid[0].length;
        for(int i=0;i<n;i++){
            ArrayList<Integer> list= new ArrayList<>();
            ans.add(list);
            for(int j=0;j<m;j++) list.add(0);
        }
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int x=i, y=j;
                y+=k;
                x+=y/m;
                y=y%m;
                x=x%n;
                ans.get(x).set(y,grid[i][j]);
            }
        }
        return ans;
    }
}