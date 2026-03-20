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
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<inorder.length;i++) map.put(inorder[i],i);
        return helper(inorder, postorder, 0, inorder.length-1, 0, postorder.length-1,map);
    }
    
    TreeNode helper(int[] inorder, int[] postorder, int i, int j, int x, int y,HashMap<Integer,Integer> map){
        if(i>j || x>y) return null;
        TreeNode node = new TreeNode(postorder[y]);
        int idx=map.get(postorder[y]);
        int leftSize=idx-i-1;
        node.left=helper(inorder, postorder,i, idx-1, x, x+leftSize,map);
        node.right= helper(inorder, postorder,idx+1, j, x+leftSize+1, y-1,map);
        return node;
    }
}