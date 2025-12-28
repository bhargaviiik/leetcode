class MinStack {
    Stack<Integer> s;
    PriorityQueue<Integer> pq;
    PriorityQueue<Integer> pq1;
    public MinStack() {
        s= new Stack();
        pq = new PriorityQueue<>();
        pq1 = new PriorityQueue<>();
    }
    
    public void push(int val) {
        s.push(val);
        pq.add(val);
    }
    
    public void pop() {
        int ele=s.pop();
        boolean flag=false;
        while(!pq.isEmpty()){
            int curr= pq.poll();
            if(curr==ele && !flag){flag=true;continue;}
            pq1.add(curr);
        }
        PriorityQueue<Integer> temp=pq;
        pq=pq1;
        pq1=temp;
    }
    
    public int top() {
        return s.peek();
    }
    
    public int getMin() {
        int ele=pq.poll();
        pq.add(ele);
        return ele;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */