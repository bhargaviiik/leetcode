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
        ArrayList<TreeNode> a1 = new ArrayList<>();
        ArrayList<TreeNode> a2= new ArrayList<>();
        isPath(root,p,a1);  //will find out the path from root to the node
        isPath(root,q,a2);  //even tho arr is not returned it is changed because its passed by refrence not value...
        //ive added from node found so it is stored backwards
        TreeNode lca=null;
        boolean flag=false;
        for(int i=0;i<a1.size();i++){
            for(int j=0;j<a2.size();j++){
                if(a1.get(i).val==a2.get(j).val){
                    lca=a1.get(i);
                    flag=true;
                    break;
                }
                
            }
            if(flag)break;
        }
        return lca;
    }
    public boolean isPath(TreeNode root,TreeNode node, ArrayList<TreeNode> arr){//helper function
        if(root==null){
            return false;
        }
        if(root==node){
            arr.add(root);
            return true; //backward calls should know, if value has to be added or not
        }
        boolean a=isPath(root.left,node,arr); //recursive call
        if(a){
            arr.add(root);
            return true;
        }
        boolean b=isPath(root.right,node,arr);
        if(b)arr.add(root);

        return b;
    }
}
   