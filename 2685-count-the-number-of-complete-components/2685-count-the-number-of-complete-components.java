class Solution {
    public int countCompleteComponents(int n, int[][] edges) {
        //converting into adjacency list
        int ans=0;
        HashMap<Integer, ArrayList<Integer>> graph = new HashMap<>();
        for(int i=0;i<n;i++){
            graph.put(i, new ArrayList<>());
            graph.get(i).add(i);
        }
        for(int i=0;i<edges.length;i++){
            int u= edges[i][0];
            int v= edges[i][1];
            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        HashMap< ArrayList<Integer> ,Integer> map = new HashMap<>();
        for(int key:graph.keySet()){
            ArrayList<Integer> list = graph.get(key);
            Collections.sort(list);
            map.put(list,map.getOrDefault(list,0)+1);
        }
        for(ArrayList<Integer> key:map.keySet()){
            if(map.get(key)==key.size()) ans++;
        }
        return ans;
    }
    
}