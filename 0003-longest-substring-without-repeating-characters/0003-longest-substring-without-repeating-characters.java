class Solution {
    public int lengthOfLongestSubstring(String s) {
        //proper sliding window solution with left and right pointers
        HashMap<Character,Integer> map = new HashMap<>();
        int max=0;
        int left=0; // if we have left and right- no need of count variable
        for(int right=0;right<s.length();right++){
            char curr = s.charAt(right);
            if(map.containsKey(curr)){
                left= Math.max(left, map.get(curr)+1);
            }
            map.put(curr,right);
            max= Math.max(max, right-left+1);
        }
        return max;
    }
}