class Solution {
    public int romanToInt(String s) {
        int num=comp(s.charAt(0));
        int prev=num;
        for(int i=1;i<s.length();i++){
            char c= s.charAt(i);
            int val = comp(c);
            if(val<=prev){num+=val;
            prev=val;}
            else{
                num-=prev;
                num+=val-prev;
                prev=val-prev;
            }
        }
        return num;
    }
    int comp(char a){
        switch(a){
            case 'I': return 1;
          
            case 'V': return 5;
        
            case 'X': return 10;
          
            case 'L': return 50;
        
            case 'C': return 100;

            case 'D': return 500;
       
            case 'M': return 1000;
       
        } return -1;
    }
}