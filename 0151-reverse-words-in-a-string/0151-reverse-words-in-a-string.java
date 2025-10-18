class Solution {
    public String reverseWords(String s) {
        StringBuilder ans = new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            char c = s.charAt(i);
            if(c!=' '){ 
                int count=0;
                for(int j=i;j>=0;j--){
                    if(s.charAt(j)==' '){
                        ans.append(s.substring(j+1,i+1));
                        ans.append(' ');
                        count=j;
                        break;
                    }
                    if(j==0) ans.append(s.substring(j,i+1));
                }
                i=count;
            }

        }
        if (ans.charAt(ans.length() - 1) == ' ') ans.deleteCharAt(ans.length() - 1);
        return ans.toString();
    }
}