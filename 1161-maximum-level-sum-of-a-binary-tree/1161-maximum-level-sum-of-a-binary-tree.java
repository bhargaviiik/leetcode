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
    public int maxLevelSum(TreeNode root) {
        int max= Integer.MIN_VALUE;
        int ans=0;
        int i=0;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        int sum=0;
        while(!q.isEmpty()){
            TreeNode curr=q.poll();
            if(curr==null){
                i++;
                if(sum>max) ans=i;
                max=Math.max(sum,max);
                if(!q.isEmpty()) q.add(null);
                sum=0;
                continue;
            }
            sum+=curr.val;
            if(curr.right!=null)q.add(curr.right);
            if(curr.left!=null)q.add(curr.left);
        }
        return ans;
    }
}