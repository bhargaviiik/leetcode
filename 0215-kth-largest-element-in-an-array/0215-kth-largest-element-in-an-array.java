class Solution {
    public int findKthLargest(int[] nums, int k) {
        //using a min-heap...
        PriorityQueue<Integer> pq= new PriorityQueue<>();
        for(int i=0;i<nums.length;i++){
            pq.add(nums[i]); //always add first before polling...
            if(pq.size()>k)pq.poll(); //smaller elements are polled since this is a min-heap..
        }
        return pq.poll();
    }
}