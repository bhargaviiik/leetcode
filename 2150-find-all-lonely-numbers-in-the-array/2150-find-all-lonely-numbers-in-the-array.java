class Solution {
    public List<Integer> findLonely(int[] nums) {
        ArrayList<Integer> arr=new ArrayList<>();
        int n=nums.length;
        Arrays.sort(nums);
        //if array contains of lesser than 2 elements then following edge case
        if(n==0){
            return arr;
        }
        if(n==1){
            arr.add(nums[0]);
            return arr;
        }
        if(nums[0]+1!=nums[1]&&nums[0]!=nums[1]){
            arr.add(nums[0]);
        }
        if(nums[n-1]!=nums[n-2]+1&&nums[n-1]!=nums[n-2]){
            arr.add(nums[n-1]);
        }
        for(int i=1;i<n-1;i++){
            if(nums[i]+1==nums[i+1]){
                continue; //direct next iteration called
            }
            else if(nums[i]==nums[i-1]+1){
                continue;
            }
            else if(nums[i]==nums[i-1]||nums[i]==nums[i+1]){
                continue;
            } // all can be simplified using or..
            arr.add(nums[i]);
        }
        return arr;

    }
}