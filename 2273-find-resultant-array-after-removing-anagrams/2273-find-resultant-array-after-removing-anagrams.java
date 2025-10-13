class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> ans = new ArrayList<>();
        ans.add(words[0]);
        for(int i=1;i<words.length;i++){
            int[] map = new int[26];
            String one = ans.get(ans.size()-1);
            String two = words[i];
            if(one.length()!=two.length()){
                ans.add(words[i]); 
                continue;
            }
            for(int j=0;j<one.length();j++){
                map[one.charAt(j)-'a']++;
                map[two.charAt(j)-'a']--;
            }
            if(!isAnagram(map)){
                ans.add(words[i]);
            }
        }
        return ans;
    }
    boolean isAnagram(int[] map){
        for(int i=0;i<map.length;i++){
            if(map[i]!=0) return false;
        }
        return true;
    }
}