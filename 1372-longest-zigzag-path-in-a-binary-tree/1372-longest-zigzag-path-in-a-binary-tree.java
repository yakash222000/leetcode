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
    int ans = 0;
    public void helper(TreeNode root, int temp, String dir) {
        ans = Math.max(ans, temp);
        if(root == null)
            return;
        
        if(dir.equals("left")) {
            helper(root.right, temp + 1, "right");
            helper(root.left, 1, "left");
        }
        if(dir.equals("right")) {
            helper(root.right, 1, "right");
            helper(root.left, temp + 1, "left");
        }
    }
    public int longestZigZag(TreeNode root) {
        if(root == null | (root.left == null && root.right == null))
            return 0;
        helper(root.left, 1, "left");
        helper(root.right, 1, "right");
        return ans-1;
    }
}