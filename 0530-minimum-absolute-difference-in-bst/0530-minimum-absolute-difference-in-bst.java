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
    public int getMinimumDifference(TreeNode root) {
        int[] count = new int[100001];
        helper(root,count);
        int a=-1;
        int i=0;
        if(count[0]>1) return 0;
        int min=100001;
        while(i<count.length){
            if(count[i]>1) return 0;
            if(count[i]!=0){
                if(a==-1) a=i;
                else{
                    min=Math.min(min,i-a); 
                    a=i;
                }
            }
            i++;
        }
        return min;
    }
    void helper(TreeNode root, int[] count){
        if(root==null) return;
        count[root.val]++;
        helper(root.left,count);
        helper(root.right,count);
    }
}