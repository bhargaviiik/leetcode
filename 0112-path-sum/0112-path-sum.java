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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null)return false;
        return helper(root,targetSum,0);
    }
    public boolean helper(TreeNode root,int targetSum,int sum){
        if(root==null)return false;
        if(root.left==null&&root.right==null){//arrived at leaf node 
            if(sum+root.val==targetSum)return true;
            return false;
        }
        return helper(root.left,targetSum,sum+root.val) || helper(root.right,targetSum,sum+root.val);
    }
}