class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> hm= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i])){
                hm.put(nums[i],hm.get(nums[i])+1);
                continue;
            }
            hm.put(nums[i],1);
        }
        int n=nums.length/2;
        Set<Integer> keySet = hm.keySet();
        for(int key:keySet){
            if(hm.get(key)>n) return key;
        }
        return -1;
    }
}