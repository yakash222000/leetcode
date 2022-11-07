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
    public int sumNumbers(TreeNode root) {
        if(root==null) return res;
        dfs(root,0);
        return res;
    }
    void dfs(TreeNode node,int sum) {
            if(node.left==null && node.right==null) {
                    sum*=10;
                    sum+=node.val;
                    res+=sum;
                    return;
            }
            sum*=10;
            sum+=node.val;
            if(node.left!=null)dfs(node.left,sum);
            if(node.right!=null)dfs(node.right,sum);
            
            
    }
}