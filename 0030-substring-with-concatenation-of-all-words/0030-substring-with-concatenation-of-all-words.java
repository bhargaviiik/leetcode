class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> ans = new ArrayList<>();
        if(s.length()==0 || words.length==0) return ans;
        int wordLen=words[0].length();
        int wordCount= words.length;
        HashMap<String,Integer> wordMap= new HashMap<>();
        for(String word:words) wordMap.put(word,wordMap.getOrDefault(word,0)+1);
        for(int offset=0;offset<wordLen;offset++){
            int left=offset;
            int count=0;
            HashMap<String,Integer> seen= new HashMap<>();
            for(int j=offset;j+wordLen<=s.length();j=j+wordLen){
                String word= s.substring(j,j+wordLen);
                if(wordMap.containsKey(word)){
                    seen.put(word,seen.getOrDefault(word,0)+1);
                    count++;
                    while(seen.get(word)>wordMap.get(word)){
                        String leftWord= s.substring(left,left+wordLen);
                        seen.put(leftWord,seen.get(leftWord)-1);
                        count--;
                        left+=wordLen;
                    }
                    if(count==wordCount) ans.add(left);
                }
                else{
                    seen.clear();
                    count=0;
                    left=j+wordLen; //curr word is invalid, j will move on its on, we'll have to move left(start of window)
                }
            }
        }
        return ans;
    }
}