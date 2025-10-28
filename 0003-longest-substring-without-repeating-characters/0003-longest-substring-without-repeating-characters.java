class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max=0;
        int count=0;
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char curr= s.charAt(i);
            if(!map.containsKey(curr)){
                count++;
                map.put(curr,i);
            }
            else{
                max=Math.max(max,count);
                int idx= map.get(curr);
                count=i-idx;  // where the repeating element lies 
                // characters before idx have to be removed from map
                map = new HashMap<>();
                for(int j=idx+1;j<=i;j++){
                    map.put(s.charAt(j),j);
                }
                // (map.put(curr, i))if its in the map before idx, it will get removed
            }
        }
        max= Math.max(max,count);  //max check is in repeat cond, what if it doesnt invoke
        return max;
    }
}