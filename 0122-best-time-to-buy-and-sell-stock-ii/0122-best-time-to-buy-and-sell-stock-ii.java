class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length==0 || prices.length==1) return 0;
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<prices.length-1;i++){
            if(prices[i+1]>prices[i]){
                ans.add(prices[i]);
                int end=i+1;
                int j=i+1;
                while(j<prices.length-1 && prices[j+1]>prices[j]){
                    end++;
                    j++;
                }
                ans.add(prices[end]);
                i=end; //skip i to the end
            }
        }
        int maxProfit=0;
        int i=0;
        while(ans.size()>1 && i<ans.size()-1){
            int a= ans.get(i);
            int b= ans.get(i+1);
            maxProfit+= b-a;
            i=i+2;
        }
        return maxProfit;
    }
}