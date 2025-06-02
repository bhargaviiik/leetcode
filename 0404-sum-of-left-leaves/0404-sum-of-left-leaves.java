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
    public int sumOfLeftLeaves(TreeNode root) {
        int sum=0;
        return leaf(root);
    }
    public int leaf(TreeNode root){ //if we pass through parameters a copy is being passed of sum so it wont retain
        int sum=0; //sum is being returned everytime so resetting is fine
        if(root!=null&&root.left!=null && root.left.left==null && root.left.right==null){
            sum+=root.left.val;
            //return ends the function if root node has a single successor at left
        }
        if(root!=null)sum+=leaf(root.left); //gotta store returned value too
        if(root!=null)sum+=leaf(root.right);
        return sum;
    }
}