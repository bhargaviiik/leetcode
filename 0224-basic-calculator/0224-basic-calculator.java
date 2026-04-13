class Solution {
    public int calculate(String s) {
        //for - we can just multiply the number by -1 and add it to our result
        // we use a stack to store previous state, which we'll have to in case of parenthesis
        int res=0; //running total for current expression 
        int curr=0; // curr number being built (can be muti digit)
        int sign=1;
        Stack<Integer> stack = new Stack<>(); // used to remeber previous sign and result
        for(char c:s.toCharArray()){
            if(Character.isDigit(c)) curr=curr*10+(c-'0');
            else if(c=='+'){
                res+=curr*sign; //add to result with sign
                sign=1; // sign is +ve
                curr=0; //reset curr number
            }
            else if(c=='-'){
                res+=curr*sign; //add to result with sign
                sign=-1; // sign is +ve
                curr=0; //reset curr number
            }
            else if(c=='('){
                stack.push(res);
                stack.push(sign);
                res=0;
                sign=1;
                curr=0;
            }
            else if(c==')'){
                res+=curr*sign; //add to result with sign
                curr=0; //reset curr number
                res*=stack.pop(); //multiply with the sign before (
                res+=stack.pop();
            }
        }
        res+=sign*curr; //handles last number
        return res;
    }
}