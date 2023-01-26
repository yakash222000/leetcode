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
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
            return help(cloned,target.val);       
    }
        TreeNode help(TreeNode node ,int target){
                if(node ==null) return null;
                if(node.val==target) return node;
                TreeNode left = null;
                TreeNode right = null;
                if(node.left!=null)left = help(node.left,target);
                if(node.right!=null)right = help(node.right,target);
                if(left==null && right==null) return null;
                else if(left !=null && left.val==target) return left;
                else if(right != null && right.val==target) return right;
                else return null;
        }
}