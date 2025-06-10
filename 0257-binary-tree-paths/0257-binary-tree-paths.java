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
    public List<String> binaryTreePaths(TreeNode root) {
        StringBuilder str = new StringBuilder("");
        //can make a arraylist or a linkedlist doesnt matter but arraylist has easier operations for remove 
        ArrayList<String> list = new ArrayList<>();
        if (root == null)
            return list;
        if (root.left == null && root.right == null) {
            list.add(String.valueOf(root.val));
            return list;
        }
        helper(root, list, str);
        return list;
    }

    public void helper(TreeNode root,ArrayList<String> list,StringBuilder str){
        if(root==null)return;  //for  one child null condition
        if(root.left==null&&root.right==null){//condition for leaf node
            int length=str.length();
            list.add(str.append(root.val).toString());
            str.setLength(length);
            return;
        }
        int length=str.length();
        str.append(root.val+"->");
        helper(root.left,list,str);
        helper(root.right,list,str);
        str.setLength(length);//truncates from the end
    }
}