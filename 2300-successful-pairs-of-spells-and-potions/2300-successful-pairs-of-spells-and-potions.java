class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int n= spells.length;
        int m= potions.length;
        int[] pairs= new int[n];
        Arrays.sort(potions);
        for(int i=0;i<pairs.length;i++){
            int curr= spells[i];
            pairs[i]= potionsNo(curr,potions,success);//no. of potions which can align with ith spell
        }
        return pairs;
    }
    int potionsNo(int curr, int[] potions, long success){
        int si=0;
        int ei=potions.length-1;
        while(si<=ei){
            int mid=si+(ei-si)/2;
            if((long)potions[mid]* curr>=success){
                ei=mid-1;
            }else{
                si=mid+1;
            }
        }
        return potions.length-si;
    }
}