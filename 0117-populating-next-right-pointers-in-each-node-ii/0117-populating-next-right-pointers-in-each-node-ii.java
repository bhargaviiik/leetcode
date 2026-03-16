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
        if(root==null) return null;
        Node node = root;

        if(node.left!=null && node.left.next==null){
            if(root.right!=null){root.left.next=root.right; connect(node.next);}
            else{
                node=node.next;
                while(node!=null){
                    if(node.left!=null){root.left.next=node.left; connect(node); break;}
                    if(node.right!=null){root.left.next=node.right; connect(node); break;}
                    node=node.next;
                }
            }

        } 
        if(root.right!=null && root.right.next==null){
            node=root.next;
            while(node!=null){
                if(node.left!=null){root.right.next=node.left; connect(node); break;}
                if(node.right!=null){root.right.next=node.right; connect(node); break;}
                node=node.next;
            }
        }
        connect(root.left);
        connect(root.right);
        return root;
    }
}