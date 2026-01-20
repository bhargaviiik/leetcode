class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        HashMap<Integer,ArrayList<Integer>> graph= new HashMap<>();
        for(int i=0;i<prerequisites.length;i++){
            int a= prerequisites[i][0];
            int b= prerequisites[i][1];
            graph.putIfAbsent(a,new ArrayList<>());
            graph.get(a).add(b);
        }
        HashSet<Integer> visited= new HashSet<>();
        for(Integer k:graph.keySet()){
            if(!visited.contains(k)){
                if(!dfs(k,visited,graph, new HashSet<>()))return false;
                visited.add(k);  //marking the key globally visited
            }
        }
        return true;
    }
    boolean dfs(Integer k, HashSet<Integer> visited, HashMap<Integer,ArrayList<Integer>> graph, HashSet<Integer> locVisited){
        if(locVisited.contains(k)) return false; //key already in local path->return false
        locVisited.add(k);  //adding key in current path
        if(!graph.containsKey(k)){ visited.add(k); return true;} //nothing ahead, adding to globally visited and returning..
        for(int i=0;i<graph.get(k).size();i++){
            if(!visited.contains(graph.get(k).get(i))){ //if the key is already not processed go ahead
                if(!dfs(graph.get(k).get(i),visited,graph,locVisited))return false;
                visited.add(graph.get(k).get(i)); // adding to local while coming back...
            }
        }
        return true;
    }
}