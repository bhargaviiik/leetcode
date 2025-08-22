class Solution {
    public boolean isSubsequence(String s, String t) {
        int i=0,j=0;
        if(s.length()>t.length()) return false;
        while(i<s.length() && j<t.length()){
            if(s.charAt(i)==t.charAt(j)){
                i++;
                j++;
            }
            else j++;
        }
        if(i==s.length()) return true;
        return false;
    }
}