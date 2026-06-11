class MedianFinder {
    PriorityQueue<Integer> minHeap;  //will contain larger elements
    PriorityQueue<Integer> maxHeap;  //will contain smaller elements
    public MedianFinder() {
        minHeap = new PriorityQueue<>();
        maxHeap = new PriorityQueue<>(Collections.reverseOrder());
    }
    
    public void addNum(int num) {
        maxHeap.add(num);
        minHeap.add(maxHeap.poll());
        if(maxHeap.size()<minHeap.size()){
            maxHeap.add(minHeap.poll());
        }
    }
    
    public double findMedian() {
        int a = minHeap.size();
        int b=  maxHeap.size();
        if(a>b) return minHeap.peek();
        if(b>a) return maxHeap.peek();
        else return ((double)(minHeap.peek()+maxHeap.peek()))/2;
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */