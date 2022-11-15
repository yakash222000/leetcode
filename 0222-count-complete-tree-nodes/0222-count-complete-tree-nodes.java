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
    int ans=0;
    public int countNodes(TreeNode root) {
        help(root);
        return ans;
    }
    void help(TreeNode node){
            if(node == null) return;
            ans++;
            help(node.left);
            help(node.right);
    }
}