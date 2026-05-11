class Solution {
    public long minArraySum(int[] nums) {
        long total=0;
        Arrays.sort(nums);  //nlogn
        boolean[] exists = new boolean[1000001];
        for(int num:nums) exists[num]=true;
        for(int num:nums){
            int replacement=num;
            for(int i=1;i*i<=num;i++){
                if(num%i==0){
                    if(exists[i]){
                        replacement=i;
                        break;
                    }
                    else{
                        if(exists[num/i]) replacement=num/i;
                    }
                }
            }
            total+=replacement;
        }
        return total;
    }
}