class Solution {
    public String longestNiceSubstring(String s) {
        if(s.length()<=1) return "";  // single letter str can never be valid
        HashSet<Character> set= new HashSet<>();
        for(char c: s.toCharArray()) set.add(c);
        for(int i=0;i<s.length();i++){
            char curr= s.charAt(i);
            if(set.contains(Character.toUpperCase(curr)) && set.contains(Character.toLowerCase(curr))) continue;
            String left= longestNiceSubstring(s.substring(0,i));
            String right=longestNiceSubstring(s.substring(i+1,s.length()));
            return left.length()>=right.length()?left:right;
        }
        return s;  // whole string/substring is nice
    }
}