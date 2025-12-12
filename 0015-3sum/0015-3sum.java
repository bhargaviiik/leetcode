class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        HashMap<Integer,Integer> set = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int key= nums[i];
            if(set.containsKey(key)){
                set.put(key, set.get(key)+1);
            }else{
                set.put(key,1);
            }
        }
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                int a= nums[i];
                int b= nums[j];
                remove(a,b,set);
                int sum= a+b;
                if(set.containsKey(-sum)){
                    List<Integer> list = new ArrayList<>();
                    list.add(a);
                    list.add(b);
                    list.add(-sum);
                    Collections.sort(list);
                    ans.add(list);
                }
                add(a,b,set);
            }
        }
        List<List<Integer>> uniq = new ArrayList<>();
        for(List<Integer> a:ans){
            if(!uniq.contains(a)){
                uniq.add(a);
            }
        }
        return uniq;
    }
    void remove(int a, int b,HashMap<Integer,Integer> set){
        if(set.get(a)==1) set.remove(a);
        else set.put(a, set.get(a)-1);
        if(set.get(b)==1) set.remove(b);
        else set.put(b, set.get(b)-1);
    }
    void add(int a, int b,HashMap<Integer,Integer> set){
        if(set.containsKey(a)){
            set.put(a, set.get(a)+1);
        }
        else{
            set.put(a,1);
        }
        if(set.containsKey(b)){
            set.put(b, set.get(b)+1);
        }
        else{
            set.put(b,1);
        }
    }
}