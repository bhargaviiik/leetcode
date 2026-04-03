class Solution {
    public String longestNiceSubstring(String s) {
        String ans="";
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                String newS= s.substring(i,j+1);
                if(isNice(newS)){
                    if(newS.length()>ans.length()){
                        ans=newS;
                    }
                }
            }
        }
        return ans;
    }
    boolean isNice(String s){
        HashSet<Character> set = new HashSet<>();
        for(char c:s.toCharArray()){
            set.add(c);
        }
        for(int i=0;i<s.length();i++){
            char curr=s.charAt(i);
            if(!set.contains(Character.toUpperCase(curr))) return false;
            if(!set.contains(Character.toLowerCase(curr))) return false;
        }
        return true;
    }
}