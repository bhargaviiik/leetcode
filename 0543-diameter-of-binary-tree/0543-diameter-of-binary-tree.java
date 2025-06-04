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
class Solution { //diameter is calculated in terms of edges 
    public int diameterOfBinaryTree(TreeNode root) {
        Info obj=diameter(root);
        return obj.maxDiam;
    }
    class Info{
        int maxDiam;
        int height;
        Info(int max,int height){
            this.maxDiam=max;
            this.height=height;
        }
    }
    public Info diameter(TreeNode root){
        if(root==null){
            return new Info(0,0); // 0 would mean no height
        }
        Info left=diameter(root.left);
        Info right=diameter(root.right);
        int currDiam=left.height+right.height; //no +1 since edges are calculated
        int maxDiam=Math.max(left.maxDiam,Math.max(right.maxDiam,currDiam));
        return new Info(maxDiam,Math.max(left.height,right.height)+1); //height measured in terms of nodes
        
    }
}