class LRUCache {
    class Node{
        int key,value;
        Node prev,next;
        Node(int key,int val){
            this.key=key;
            this.value=val;
        }
    }
    int capacity;
    Node head,tail;
    HashMap<Integer,Node> map; //to store key and node
    
    public LRUCache(int capacity) {
        this.capacity=capacity;
        head= new Node(0,0);
        tail= new Node(0,0);
        map = new HashMap<>();
        head.next=tail;
        tail.prev=head;
    }
    
    public int get(int key) {
        if(!map.containsKey(key)) return -1;
        Node node= map.get(key);
        remove(node);
        insert(node);
        return node.value;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            Node node= map.get(key);
            node.value=value;
            remove(node);
            insert(node);
        }
        else{
            if(map.size()==capacity){
                Node node=tail.prev;
                remove(node);
                map.remove(node.key);
                Node newNode = new Node(key,value);
                map.put(key,newNode);
                insert(newNode);
            }
            else{
                Node node= new Node(key,value);
                map.put(key,node);
                insert(node);
            }
        }
    }

    public void remove(Node node){
        node.prev.next=node.next;
        node.next.prev=node.prev;
    }

    public void insert(Node node){
        node.next=head.next;
        node.prev=head;
        head.next=node;
        node.next.prev=node;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */