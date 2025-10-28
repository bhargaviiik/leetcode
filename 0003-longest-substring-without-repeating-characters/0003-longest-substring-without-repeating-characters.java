class Solution {
    public int lengthOfLongestSubstring(String s) {
        boolean[] vis = new boolean[257];
        int max=0;
        int count=0;
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char curr= s.charAt(i);
            if(!vis[curr]){
                count++;
                vis[curr]=true;
                map.put(curr,i);
            }
            else{
                max=Math.max(max,count);
                int idx= map.get(curr);
                count=i-idx;  // where the repeating element lies 
                map.put(curr,i);
            }
        }
        max= Math.max(max,count);  //max check is in repeat cond, what if it doesnt invoke
        return max;
    }
}