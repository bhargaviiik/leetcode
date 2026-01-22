class Solution {
    int c=0;
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[] ans = new int[numCourses];
        HashMap<Integer,ArrayList<Integer>> graph=new HashMap<>();
        HashSet<Integer> visited= new HashSet<>();
        for(int i=0;i<prerequisites.length;i++){
            if(!graph.containsKey(prerequisites[i][0])){
                graph.put( prerequisites[i][0],new ArrayList<>() );
                graph.get(prerequisites[i][0]).add(prerequisites[i][1]);
            }
            else{
                graph.get(prerequisites[i][0]).add(prerequisites[i][1]);
            }
        }
        for(int node : graph.keySet()){
            if(!visited.contains(node)){
                if(!dfs(ans,graph,node,new HashSet<Integer>(),visited)) return new int[]{};
                
            }
        }
        for(int i = 0; i < numCourses; i++){
            if(!visited.contains(i)){
                ans[c++] = i;
            }
        }
        return ans;
    }
    boolean dfs(int[] ans,HashMap<Integer,ArrayList<Integer>> graph,int node,HashSet<Integer> locVisited, HashSet<Integer> visited){
        if(locVisited.contains(node))return false; //loop exists
        if(!graph.containsKey(node)){ //node with no dependencies
            visited.add(node);
            ans[c++]=node;
            return true; 
        } 
        locVisited.add(node);
        for(int i=0;i<graph.get(node).size();i++){
            if(!visited.contains(graph.get(node).get(i))){
                if(!dfs(ans,graph,graph.get(node).get(i),locVisited,visited))return false;
            }
        }
        visited.add(node);
        ans[c++]=node;
        return true;
    }
}