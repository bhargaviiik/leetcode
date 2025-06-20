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
        if(root==null ){
            return false;
        }
        if(isIdentical(root,subRoot)){
            return true;
        }
        boolean a=isSubtree(root.left,subRoot);
        boolean b=isSubtree(root.right,subRoot);
        return a||b;
    }
    public boolean isIdentical(TreeNode node,TreeNode subRoot){
        //its easier to check for false than true
        if(node==null && subRoot==null)return true;
        else if(node==null|| subRoot==null)return false;
        if(node.val!=subRoot.val)return false;
        boolean a = isIdentical(node.left,subRoot.left);
        boolean b = isIdentical(node.right,subRoot.right);
        return a&&b;
    }
}