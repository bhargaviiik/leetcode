class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        if(arr.length==1 || arr.length==0) return true;
        int min= Integer.MAX_VALUE, min2= Integer.MAX_VALUE;
        HashSet<Integer> set= new HashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
            min=Math.min(min,arr[i]);
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=min) min2=Math.min(min2,arr[i]);
        }
        int diff=0;
        diff= min2-min;
        if(min2==Integer.MAX_VALUE) diff=0;
        for(int i=1;i<arr.length;i++){
            if(!set.contains(min+diff)) {return false; }
            min=min+diff; 
        }
        return true;
    }
}