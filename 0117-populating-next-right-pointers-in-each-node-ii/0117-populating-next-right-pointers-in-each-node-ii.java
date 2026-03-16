/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        Node curr=root;
        while(curr!=null){
            Node p1=new Node(0);
            Node dummy=p1;
            while(curr!=null){
                if(curr.left!=null){
                    p1.next=curr.left;
                    p1=p1.next;
                }
                if(curr.right!=null){
                    p1.next=curr.right;
                    p1=p1.next;
                }
                curr=curr.next;
            }
            curr=dummy.next;  //change the level
        }
        return root;
    }
}