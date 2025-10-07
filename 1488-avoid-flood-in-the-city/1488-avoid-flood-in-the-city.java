class Solution {
    public int[] avoidFlood(int[] rains) {
        HashMap<Integer,Integer> map = new HashMap<>();
        TreeSet<Integer> dryDays= new TreeSet<>();
        int[] ans = new int[rains.length];
        Arrays.fill(ans,1);
        for(int i=0;i<rains.length;i++){
            int lake= rains[i];
            if(lake==0){
                dryDays.add(i);
            }else if(map.containsKey(lake)){
                ans[i]=-1;
                Integer dryIdx= dryDays.higher(map.get(lake));
                if(dryIdx==null) return new int[0];
                ans[dryIdx]=lake;
                map.put(lake,i);
                dryDays.remove(dryIdx);
                map.put(lake,i);
            }else{
                map.put(lake,i);
                ans[i]=-1;
            }
            
        }
        return ans;
    }
}