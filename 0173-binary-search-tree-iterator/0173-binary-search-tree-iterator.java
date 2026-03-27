/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class BSTIterator {
    TreeNode curr;
    public BSTIterator(TreeNode root) {
        curr=root;
    }
    
    public int next() {
        int val=-1;
        while(curr!=null){
            if(curr.left==null){
                val=curr.val;   // means this is the node with no left further, so curr val acc to inorder trav after left
                curr=curr.right;// after left being null and curr being done we move towards right..
                break;
            }
            else{  //else if left is not null we assign left node to pred
                TreeNode pred= curr.left;
                //lets find inorder predcessor 
                while(pred.right!=null && pred.right!=curr){
                    pred=pred.right;
                }
                if(pred.right==null){
                    //create thread
                    pred.right=curr;  //we assign it to curr and not pred, bc if we're at right, pred will already be done
                    curr=curr.left;
                }
                else{
                    //remove thread
                    pred.right=null;
                    val=curr.val;
                    curr=curr.right;
                    break;    //else the loop will continue
                }
            }
        }
        return val;
    }
    
    public boolean hasNext() {
        return curr!=null;
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */