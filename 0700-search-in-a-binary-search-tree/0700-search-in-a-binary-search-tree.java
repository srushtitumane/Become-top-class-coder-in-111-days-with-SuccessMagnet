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
    TreeNode result=null;
    public TreeNode searchBST(TreeNode root, int val) {
        fun(root,val);
        return result;

        
    }

    void fun(TreeNode root,int val){
        //base case
        if(root==null) return;

        if(root.val>val){
            fun(root.left,val);
        }
        else if(root.val<val){
            fun(root.right,val);
        }
        else{
            result=root;
            return;
        }
        return;

    }

}