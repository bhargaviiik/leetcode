class Solution {
    public String gcdOfStrings(String str1, String str2) {
        StringBuilder x = new StringBuilder();
        for(int i= Math.min(str1.length(),str2.length()); i>0 ;i--){
            if(isValid(str1,str2,i)) return str1.substring(0,i);
        }
        return "";
    }
    public boolean isValid(String str1, String str2, int i){
        int a= str1.length(), b=str2.length();
        if(a%i>0 || b%i>0) return false;
        String base= str1.substring(0,i);
        return (str1.replace(base,"").isEmpty() && str2.replace(base,"").isEmpty());
    }
}