class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(char c : s.toCharArray()){
            if(!st.isEmpty() && isMatch(st.peek(),c)) st.pop();
            else st.push(c);
        }
        if(st.isEmpty()) return true;
        return false;
    }
    boolean isMatch(char a, char b){
        if(a=='(' && b==')') return true;
        if(a=='[' && b==']') return true;
        if(a=='{' && b=='}') return true;
        return false;
    }
}