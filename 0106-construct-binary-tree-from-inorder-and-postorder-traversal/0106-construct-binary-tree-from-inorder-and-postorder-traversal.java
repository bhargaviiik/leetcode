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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return helper(inorder, postorder, 0, inorder.length-1, 0, postorder.length-1);
    }
    
    TreeNode helper(int[] inorder, int[] postorder, int i, int j, int x, int y){
        if(i>j || x>y) return null;
        TreeNode node = new TreeNode(postorder[y]);
        int idx=0;
        for(int a=i;a<=j;a++){
            if(inorder[a]==postorder[y]){idx= a; break;}
        }
        int leftSize=idx-i-1;
        node.left=helper(inorder, postorder,i, idx-1, x, x+leftSize);
        node.right= helper(inorder, postorder,idx+1, j, x+leftSize+1, y-1);
        return node;
    }
}