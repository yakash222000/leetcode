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
    int ans = Integer.MAX_VALUE,last=Integer.MAX_VALUE;
    public int getMinimumDifference(TreeNode root) {
        dfs(root);
        return ans;
    }
    
    void dfs(TreeNode node){
        if(node==null) return;
        dfs(node.left);  
        //System.out.println(node.val+"  "+last);
        ans=Math.min(ans,Math.abs(node.val-last));
        last=node.val;
        dfs(node.right);
        
        
    }
}