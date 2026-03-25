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
    int i=0;
    public int kthSmallest(TreeNode root, int k) {
        if(root==null) return -1;
        int a=kthSmallest(root.left,k);
        if(a>=0) return a;
        i++;
        if(i==k) return root.val;
        int b=kthSmallest(root.right,k);
        if(b>=0) return b;
        return -1;
    }
}