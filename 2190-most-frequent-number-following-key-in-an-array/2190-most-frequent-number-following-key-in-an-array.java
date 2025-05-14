class Solution {
    public int mostFrequent(int[] nums, int key) {
        ArrayList<Integer> arr=new ArrayList<>(1001); //constraints: 1<=nums[i]<=1000
        for (int i = 0; i <= 1000; i++) {
            arr.add(0);
        }
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==key){
                arr.set(nums[i+1], arr.get(nums[i+1]) + 1);
            }
        }
        int max=Integer.MIN_VALUE;
        int maxi=0;
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)>max){
                max=arr.get(i);
                maxi=i;
            }
        }
        return maxi;
    }
}