class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        for(String s:strs){
            char[] arr= s.toCharArray();
            Arrays.sort(arr);
            String key= new String(arr);
            if(map.containsKey(key)){
                map.get(key).add(s);
            }
            else{
                List<String> list= new ArrayList<>();
                list.add(s);
                map.put(key,list);
            }
        }
        List<List<String>> ans = new ArrayList<>(map.values());
        map.clear();
        return ans;
    }
}