class Solution {
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        HashMap<String, HashMap<String, Double>> graph= new HashMap<>();
        
        for(int i=0;i<equations.size();i++){
            String a = equations.get(i).get(0);
            String b = equations.get(i).get(1);
            graph.putIfAbsent(a, new HashMap<>());
            graph.putIfAbsent(b, new HashMap<>());
            graph.get(a).put(b,values[i]);
            graph.get(b).put(a,(1.0/values[i]));
        }

        double[] result = new double[queries.size()];
        for(int i=0;i<queries.size();i++){
            String a =queries.get(i).get(0);
            String b= queries.get(i).get(1);
            if(!graph.containsKey(a) || !graph.containsKey(b)) result[i]= -1.0;
            else if( a.equals(b)) result[i]= 1.0;
            else{
                HashSet<String> visited = new HashSet<>(); //new set for every query
                result[i]= dfs(a,b,graph,visited,1.0);
            }
        }
        return result;
    }
    double dfs(String srcNode, String desNode, HashMap<String, HashMap<String, Double>> graph ,HashSet<String> visited, double product){
        if(srcNode.equals(desNode)) return product;
        visited.add(srcNode);
        for(Map.Entry<String,Double> entry: graph.get(srcNode).entrySet()){
            String nextNode = entry.getKey();
            Double weight= entry.getValue();
            if(!visited.contains(nextNode)){
                Double res=dfs(nextNode,desNode,graph,visited,product*weight);
                if(res!=-1.0) return res;
            }
        }
        return -1.0;
    }
}