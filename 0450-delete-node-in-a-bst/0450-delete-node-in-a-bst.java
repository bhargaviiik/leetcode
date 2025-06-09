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
    public TreeNode inorderSuccessor(TreeNode node){
        while(node.left!=null){
            node=node.left;
        }
        return node;
    }
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null){ //edge case
            return null;
        }
        //cannot do recursion in place, so will have to return values 
        //so returning changed value or returning the node as it is
        if(root.val>key){
            root.left=deleteNode(root.left,key);
        }
        else if(root.val<key){
            root.right=deleteNode(root.right,key);
        }
        else if(root.val==key){
            //case 1:leaf node
            if(root.left==null && root.right==null){
                return null; //so automatically deleted
            }
            //case 2:has one child
            if(root.right==null){
                return root.left;
            }
            else if(root.left==null){
                return root.right;
            }
            // case 3: has two children
            TreeNode IS = inorderSuccessor(root.right);//leftmost node in right subtree..
            root.val=IS.val;
            root.right = deleteNode(root.right, IS.val);
            return root;  //this is unecessary 
        }
        return root;
    }
}