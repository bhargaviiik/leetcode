class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq= new ArrayDeque<>(); //double ended queue storing indices
        //monotonic decreasing
        int n=nums.length;
        int[] ans=new int[n-k+1];
        for(int i=0;i<k;i++){
            while(!dq.isEmpty() && nums[dq.peekLast()]<nums[i])dq.removeLast();
            dq.offerLast(i);
        }
        ans[0]=nums[dq.peekFirst()];
        int c=1;
        for(int i=k;i<n;i++){
            while(!dq.isEmpty() && nums[dq.peekLast()]<nums[i])dq.removeLast();
            dq.offerLast(i);
            while(!dq.isEmpty()&&dq.peekFirst()<i-k+1)dq.removeFirst();
            if(!dq.isEmpty()){
                ans[c]=nums[dq.peekFirst()];
                c++;
            }
        }
        return ans;

    }
}