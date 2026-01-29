class Solution {
    public List<String> letterCombinations(String digits) {
        HashMap<Integer, List<Character> > map = new HashMap<>();
        int c=0;
        for(int i=2;i<=6;i++){
            map.put(i,new ArrayList<>());
            for(int j=0;j<3;j++) map.get(i).add((char)('a'+(c++)));
        }
        for(int i=7;i<=9;i++)map.put(i,new ArrayList<>());
        map.get(7).add('p');
        map.get(7).add('q');
        map.get(7).add('r');
        map.get(7).add('s');
        map.get(8).add('t');
        map.get(8).add('u');
        map.get(8).add('v');
        map.get(9).add('w');
        map.get(9).add('x');
        map.get(9).add('y');
        map.get(9).add('z');

        List<String> ans= new ArrayList<>();
        helper(map,0,digits,ans,new StringBuilder(""));
        return ans;
    }
    void helper(HashMap<Integer,List<Character>> map,int i,String digits,List<String> ans,StringBuilder str){
        if(i>=digits.length()){
            ans.add(str.toString());
            return;
        }
        int dig=digits.charAt(i)-'0';  //substracted '0' from it
        for(int j=0;j<map.get(dig).size();j++){
            helper(map,i+1,digits,ans,str.append(map.get(dig).get(j)));
            str.deleteCharAt(str.length()-1);
        }
    }
}