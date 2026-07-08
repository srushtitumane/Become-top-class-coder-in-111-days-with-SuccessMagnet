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
    TreeNode result=null;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        fun(root,p,q);
        return result;
        
    }
    void fun(TreeNode root,TreeNode p,TreeNode q){
        if(root==null) return;

        if(root.val>p.val && root.val>q.val){
            fun(root.left,p,q);
        }
        else if(root.val<p.val && root.val<q.val){
            fun(root.right,p,q);
        }
        else{
            result=root;
            return;
        }
      
    }
}