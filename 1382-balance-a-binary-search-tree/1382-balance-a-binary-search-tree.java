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
    public TreeNode balanceBST(TreeNode root) {
        ArrayList<Integer> arr=new ArrayList<>();
        inorder(root,arr);
        return buildTree(arr,0,arr.size()-1);
    }
    public TreeNode buildTree(ArrayList<Integer> arr,int si,int ei){
        if(si>ei)return null;

        int mid=si+(ei-si)/2;
        TreeNode node=new TreeNode(arr.get(mid));
        node.left=buildTree(arr,si,mid-1);
        node.right=buildTree(arr,mid+1,ei);
        return node;
    }
    public void inorder(TreeNode root,ArrayList<Integer> arr){
        if(root==null)return;
        inorder(root.left,arr);
        arr.add(root.val);
        inorder(root.right,arr);
    }
}