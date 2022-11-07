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
        int res=0;
    public int maxAncestorDiff(TreeNode root) {
        dfs(root,root.val,root.val);
        return res;
    }
        void dfs(TreeNode node , int max , int min) {
                if(node==null) return;
                max=Math.max(max,node.val);
                min=Math.min(min,node.val);
                res=Math.max(max-min,res);
                if(node.left!=null) dfs(node.left,max,min);
                if(node.right!=null) dfs(node.right,max,min);
        }
}