/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        HashMap<Node,Node> map = new HashMap<>();
        Node dum= head;
        Node a = new Node(-1);
        Node ans=a;
        while(dum!=null){
            ans.next= new Node(dum.val);
            ans=ans.next; //on current node
            map.put(dum,ans); //putting in map
            dum=dum.next;
        }
        ans.next=null;
        map.put(null,ans.next);
        dum=head;
        ans=a.next;
        while(dum!=null){
            if(dum.random==null) ans.random=map.get(null);
            else ans.random= map.get(dum.random);
            dum=dum.next;
            ans=ans.next;
        }
        return a.next;
    }
}