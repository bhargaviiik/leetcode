class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s= new Stack<>();
        for(int i=0;i<tokens.length;i++){
            String curr= tokens[i];
            if(curr.equals("+")){
                int b= s.pop();
                int a =s.pop();
                int num= a+b;
                s.push(num);
            }
            else if(curr.equals("-")){
                int b= s.pop();
                int a =s.pop();
                int num= a-b;
                s.push(num);
            }
            else if(curr.equals("*")){
                int b= s.pop();
                int a =s.pop();
                int num= a*b;
                s.push(num);
            }
            else if(curr.equals("/")){
                int b= s.pop();
                int a =s.pop();
                int num= a/b;
                s.push(num);
            }
            else{
                s.push(Integer.parseInt(curr));
            }
            
        }
        return s.pop();
    }
}