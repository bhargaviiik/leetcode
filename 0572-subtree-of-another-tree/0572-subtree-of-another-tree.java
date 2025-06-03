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
 //Most of the tree problems are solved through recursion
class Solution {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root==null ){ //on root is traversed
            return false;
        }
        if(isIdentical(root,subRoot)){
            return true;
        }
        return isSubtree(root.left,subRoot)||isSubtree(root.right,subRoot) ;
    }
    public boolean isIdentical(TreeNode node,TreeNode subRoot){
        //its easier to check for false than true
        if(node==null && subRoot==null)return true;   //at some point its gonna return true if it is
        else if(node==null|| subRoot==null)return false;
        if(node.val!=subRoot.val)return false;
        return isIdentical(node.left,subRoot.left) && isIdentical(node.right,subRoot.right);
    }
}