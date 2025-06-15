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
    public TreeNode sortedArrayToBST(int[] nums) {
        return buildTree(nums,0,nums.length-1);

    }
    public TreeNode buildTree(int[] nums,int si,int ei){
        if(si>ei){//when si==ei,the node with same value will be created, but asa si>ei we'll return null
            return null;  //null is null,it doesnt have to be created in node, also node here stores int values 
        }
        //divide and conquer
        //we'll make left node,right node and then we'll merge em together
        int mid=si+(ei-si)/2;
        TreeNode node=new TreeNode(nums[mid]);
        node.left=buildTree(nums,si,mid-1);
        node.right=buildTree(nums,mid+1,ei);
        return node;
    }
}