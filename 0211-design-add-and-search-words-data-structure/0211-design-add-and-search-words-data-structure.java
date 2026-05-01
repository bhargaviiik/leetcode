class WordDictionary {
    Node root;
    class Node{
        boolean isEnd=false;
        Node[] children= new Node[26]; //initially at every index null is stored
    }

    public WordDictionary() {
        root= new Node();
    }
    
    public void addWord(String word) {
        Node ref=root;
        for(int i=0;i<word.length();i++){
            char c= word.charAt(i);
            if(ref.children[c-'a']==null){
                ref.children[c-'a']= new Node();
            }
            ref=ref.children[c-'a'];
        }
        ref.isEnd=true;
    }
    
    public boolean search(String word) {
        Node ref=root;
        return helper(ref,word,0);
    }
    
    boolean helper(Node ref, String word,int i){
        if(ref==null) return false;
        if(i==word.length()) return ref.isEnd;
        char c= word.charAt(i);
        if(c!='.' && ref.children[c-'a']==null) return false;
        else{
            if(c=='.'){
                for(int j=0;j<26;j++){
                    if(helper(ref.children[j],word,i+1)) return true;
                }
            }
            else{
                if(helper(ref.children[c-'a'],word,i+1))return true;
            }
        }
        return false;
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */