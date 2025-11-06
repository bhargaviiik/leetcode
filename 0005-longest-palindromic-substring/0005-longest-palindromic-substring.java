class Solution {
    public String longestPalindrome(String s) {
        String ans="";
        int max=0;
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                if(isPalindrome(s.substring(i,j+1))){
                    if(j-i+1>max){
                        max=j-i+1;
                        ans= s.substring(i,j+1);
                    }
                }
            }
        }
        return ans;
    }
    boolean isPalindrome(String s){
        int i=0, j= s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            j--;
            i++;
        }
        return true;
    }
}