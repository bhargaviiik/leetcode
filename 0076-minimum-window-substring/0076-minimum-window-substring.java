class Solution {
    public String minWindow(String s, String t) {
        if(s.length()<t.length()) return "";
        HashMap<Character,Integer> need= new HashMap<>();
        HashMap<Character,Integer> window= new HashMap<>(); //keep track of our curr window
        int left=0,right=0,formed=0;
        int start=0; //start of the window
        int minLen=Integer.MAX_VALUE;
        for(char c:t.toCharArray()) need.put(c,need.getOrDefault(c,0)+1);
        int required=need.size();
        while(right<s.length()){
            char c=s.charAt(right);
            window.put(c,window.getOrDefault(c,0)+1);

            if(need.containsKey(c) && need.get(c).intValue()==window.get(c).intValue()) formed++;

            while(formed==required && left<=right){
                if(right-left+1<minLen){ //updation
                    minLen=right-left+1;
                    start=left;
                }
                char leftC= s.charAt(left);
                window.put(leftC,window.get(leftC)-1); //remove occurence from curr window
                if(need.containsKey(leftC) && window.get(leftC).intValue()<need.get(leftC).intValue()) formed--;
                left++;
            }
            right++;
        }
        return minLen==Integer.MAX_VALUE?"":s.substring(start,start+minLen);
    }
}