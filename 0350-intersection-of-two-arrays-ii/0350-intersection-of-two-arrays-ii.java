class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> res = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums1.length;i++) map.put(nums1[i],map.getOrDefault(nums1[i],0)+1);
        for(int j=0;j<nums2.length;j++){
            if(map.containsKey(nums2[j]) && map.get(nums2[j])>0){
                res.add(nums2[j]);
                map.put(nums2[j],map.get(nums2[j])-1);
            }
        }
        int size= res.size();
        int[] ans= new int[size];
        for(int i=0;i<size;i++) ans[i]=res.get(i);
        return ans;
    }
}