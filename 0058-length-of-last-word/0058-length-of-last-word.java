class Solution {
    public int lengthOfLastWord(String s) {
        for(int i=s.length()-1;i>=0;i--){
            char c= s.charAt(i);
            if(c != ' '){
                int count=0;
                for(int j=i;j>=0;j--){
                    char c1= s.charAt(j);
                    if(c1 != ' ') count++;
                    else return count;
                }
                return count;
            }
        }
        return 0;
    }
}