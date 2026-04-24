class Trie {
    TrieNode root;
    class TrieNode{
        boolean isEnd=false;
        TrieNode[] children= new TrieNode[26];
    }
    public Trie() {
        root= new TrieNode();
    }
    
    public void insert(String word) {
        TrieNode ref=root;
        for(int i=0;i<word.length();i++){
            int idx= word.charAt(i)-'a';
            if(ref.children[idx]==null){
                ref.children[idx]= new TrieNode();
            }
            ref=ref.children[idx];
        }
        ref.isEnd=true; //first we find idx using the letter, then we go inside it, so rn we're inside last letter
    }
    
    public boolean search(String word) {
        TrieNode ref=root;
        for(int i=0;i<word.length();i++){
            int idx= word.charAt(i)-'a';
            if(ref.children[idx]==null) return false;
            ref=ref.children[idx];
        }
        return ref.isEnd;
    }
    
    public boolean startsWith(String prefix) {
        TrieNode ref=root;
        for(int i=0;i<prefix.length();i++){
            int idx= prefix.charAt(i)-'a';
            if(ref.children[idx]==null) return false;
            ref = ref.children[idx];
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */