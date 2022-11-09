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
    public TreeNode sufficientSubset(TreeNode root, int limit) {
        if(root == null) return null;
        
        //preOrder, use passed limit from parent to decide whether leaf need to be deleted
        if(root.left == null && root.right == null) {
            if(root.val < limit) {
                return null;
            }
            return root;
        }
        
        //post order to process left and right node
        TreeNode l = sufficientSubset(root.left, limit - root.val);
        TreeNode r = sufficientSubset(root.right, limit - root.val);
        //if all children are deteted, then itself no need to retain
        if(l == null && r == null) return null;
        root.left = l;
        root.right = r;
        return root;
    }
}