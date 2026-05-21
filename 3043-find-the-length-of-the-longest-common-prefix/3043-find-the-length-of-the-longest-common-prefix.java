class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        HashSet<Integer> set= new HashSet<>();
        for(int val:arr1){
            while(!set.contains(val) && val>0){ //pruning and base case
                set.add(val);
                val=val/10;
            }
        }
        int ans=0;
        for(int val:arr2){
            while(!set.contains(val) && val>0){
                val=val/10;
            }
            if(val>0){
                ans= Math.max(ans, (int) Math.log10(val)+1);
            }
        }
        return ans;
    }
}