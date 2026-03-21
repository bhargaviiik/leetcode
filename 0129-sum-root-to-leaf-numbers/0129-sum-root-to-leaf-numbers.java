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
class Solution {
    int totSum=0;
    public int sumNumbers(TreeNode root) {
        helper(root,0);
        return totSum;
    }
    void helper(TreeNode root, int sum){
        if(root.left==null && root.right==null){ totSum=totSum+root.val+sum; return;}
        sum=(sum+root.val)*10;
        if(root.left!=null) helper(root.left,sum);
        if(root.right!=null) helper(root.right,sum);
    }
}