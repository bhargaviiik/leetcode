class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        HashSet visited= new HashSet<>(wordList);
        if(!visited.contains(endWord)) return 0;
        Queue<String> q = new LinkedList<>();
        q.add(beginWord);
        int count=0;
        while(!q.isEmpty()){
            int size=q.size();
            count++;
            for(int j=0;j<size;j++){
                String currWord=q.poll();
                if(currWord.equals(endWord)) return count;
                char[] arr = currWord.toCharArray();
                for(int i=0;i<currWord.length();i++){
                    for(char c='a';c<='z';c++){
                        char temp=arr[i];
                        arr[i]=c;
                        String newWord= new String(arr);
                        if(visited.contains(newWord)){q.add(newWord); visited.remove(newWord);}
                        arr[i]=temp;
                    }
                }
            }
        }
        return 0;
    }
}
    