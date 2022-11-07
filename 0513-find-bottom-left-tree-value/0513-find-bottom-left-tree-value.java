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
    public int findBottomLeftValue(TreeNode root) {
        int res=0;
        Queue<TreeNode> q = new LinkedList<>();
        if(root!=null) q.add(root);
        while(!q.isEmpty()){
                int n=q.size();
                for(int i=0;i<n;i++){
                        TreeNode t=q.remove();
                        if(i==0) res=t.val;
                        if(t.left!=null)q.add(t.left);
                        if(t.right!=null)q.add(t.right);
                }
        }
        return res;
    }
}