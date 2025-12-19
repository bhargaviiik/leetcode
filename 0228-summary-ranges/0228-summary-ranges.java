class Solution {
    public List<String> summaryRanges(int[] nums) {
        
        List<String> ans= new ArrayList<>();
        if(nums.length==0) return ans;
        String list=Integer.toString(nums[0]);
        
        for(int i=1;i<nums.length;i++){
            
            if(nums[i]==nums[i-1]+1){
                continue;
            }
            else{
                if(nums[i-1]!=Integer.parseInt(list)){
                    list+="->";
                    list+=Integer.toString(nums[i-1]);
                    ans.add(list);
                }
                else ans.add(list);
                
                list=Integer.toString(nums[i]);
            }
        }
        if(nums.length!=1 && nums[nums.length-1]==nums[nums.length-2]+1){
            list+="->";
            list+=Integer.toString(nums[nums.length-1]);
            ans.add(list);
        }
        else ans.add(list);
        return ans;
    }
}