/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        ArrayList<TreeNode> arr1=new ArrayList<>();
        ArrayList<TreeNode> arr2=new ArrayList<>();
        path(root,p,arr1);
        path(root,q,arr2);
        for(TreeNode node:arr1){
            for(TreeNode node2:arr2){
                if(node==node2){
                    return node;
                }
            }
        }
        return root;
    }
    public boolean path(TreeNode root,TreeNode node,ArrayList<TreeNode> arr){
        if(root==null)return false;
        if(root==node){
            arr.add(root);
            return true;
        }
        boolean a=path(root.left,node,arr);
        if(a){
            arr.add(root);
            return true;
        }
        boolean b=path(root.right,node,arr);
        if(b){
            arr.add(root);
            return true;
        }
        return false;
    }
}