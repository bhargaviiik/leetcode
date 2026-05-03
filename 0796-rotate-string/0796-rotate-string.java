class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()) return false;
        int start=0;
        while(start<s.length()) {
            if(s.charAt(start)==goal.charAt(0)) if(helper(start,s,goal))return true;
            start++;
        }
        return false;
    }
    boolean helper(int start, String s, String goal){
        int j=0;
        int k=0;
        while(k++<s.length()){
            if(s.charAt(start)!=goal.charAt(j)) return false;
            start=(start+1)%s.length();
            j=(j+1)%s.length();
        }
        return true;
    }
}