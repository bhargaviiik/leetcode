class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> map = new HashMap<>();
        HashMap<String, Character> replaced = new HashMap<>();
        String[] arr= s.split(" ");
        if(arr.length != pattern.length()) return false;
        for(int i=0;i<arr.length;i++){
            char a = pattern.charAt(i);
            String str= arr[i];
            if(!map.containsKey(a)){
                map.put(a,str);
            }
            else{
                if(!(map.get(a).equals(str))) return false;
            }
            if(!replaced.containsKey(str)){
                replaced.put(str,a);
            }
            else{
                if(replaced.get(str)!=a) return false;
            }
        }
        return true;
    }
}