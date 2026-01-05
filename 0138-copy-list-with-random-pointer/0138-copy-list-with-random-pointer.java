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
        Node ptr1= head;
        while(head!=null){
            Node copy = new Node(head.val);
            copy.next=head.next;
            head.next=copy;
            head=head.next.next;
        }
        head=ptr1;
        while(head!=null && head.next!=null){
            if(head.random==null) head.next.random=null;
            else head.next.random=head.random.next;
            head=head.next.next;
        }
        head=ptr1;
        Node ans=ptr1.next;
        Node ansptr=ans;
        while(head!=null){
            head.next=head.next.next;
            ans.next=(ans.next != null) ? ans.next.next : null;
            head=head.next;
            ans=ans.next;
        }
        return ansptr;
    }
}