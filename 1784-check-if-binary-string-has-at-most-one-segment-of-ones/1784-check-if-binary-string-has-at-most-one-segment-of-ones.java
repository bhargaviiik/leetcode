class Solution {
    public boolean checkOnesSegment(String s) {
        // *at most* one segment, that means only a single group of one..
        //when will i say that there's only one segment, either when we'll never encounter 0 and reach s.length()...
        //or after encountering zero we never encounter one again
        boolean flag=false; 
        for(int i=1;i<s.length();i++){
            if(flag && s.charAt(i)=='1') return false;
            if(s.charAt(i)=='0') flag=true; //flag=true indicates that the initial one's stream has now ended
        }
        return true;
    }
}