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
    public String tree2str(TreeNode t) {
        if(t==null) return "";
            StringBuilder str =new StringBuilder().append(t.val);
            if(t.left == null && t.right == null)
                    return str.toString();
            
            str.append('(').append(tree2str(t.left)).append(')');
            
            if(t.right != null)
                    str.append('(').append(tree2str(t.right)).append(')');
            
            return str.toString();
    }
}