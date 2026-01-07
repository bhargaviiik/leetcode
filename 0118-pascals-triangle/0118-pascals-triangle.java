class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> one = new ArrayList<>();
        one.add(1);
        ans.add(one);
        if(numRows==1) return ans;

        List<Integer> two = new ArrayList<>();
        two.add(1);
        two.add(1);
        ans.add(two);
        if(numRows==2) return ans;
        
        for(int i=1;i<=numRows-2;i++){
            List<Integer> list = new ArrayList<>();
            list.add(1);
            List<Integer> prev= ans.get(ans.size()-1);
            for(int j=0;j<=(prev.size()-2);j++){
                int num= prev.get(j)+prev.get(j+1);
                list.add(num);
            }
            list.add(1);
            ans.add(list);
        }
        return ans;
    }
}