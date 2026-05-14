class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i=0, j=0;
        StringBuilder str= new StringBuilder();
        int c=0;
        while(i<word1.length() && j<word2.length()){
            if(c%2==0){
                str.append(word1.charAt(i));
                i++;
            }
            else{ 
                str.append(word2.charAt(j)); 
                j++;
            }
            c++;
        }
        if(i<word1.length()){
            str.append(word1.substring(i));
        }
        if(j<word2.length()){
            str.append(word2.substring(j));
        }
        return str.toString();
    }
}