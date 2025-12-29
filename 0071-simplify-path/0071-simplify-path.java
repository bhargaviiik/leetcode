class Solution {
    public String simplifyPath(String path) {
        String[] parts= path.split("/");
        Stack<String> s= new Stack<>();
        for(int i=0;i<parts.length;i++){
            String curr= parts[i];
            if(curr.equals("") || curr.equals(".")) continue;
            if(curr.equals("..")){
                if(!s.isEmpty()) s.pop();
                continue;
            }
            s.push(curr);
        }
        if(s.isEmpty()) return "/";
        StringBuilder ans = new StringBuilder();
        while(!s.isEmpty()){
            ans.insert(0,'/'+s.pop());
        }
        return ans.toString();
    }
}