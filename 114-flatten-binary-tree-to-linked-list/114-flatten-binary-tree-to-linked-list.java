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
    public void flatten(TreeNode root) {
        if (root==null) return ;
        Queue<Integer> q = new LinkedList<>();
        help(q,root);
        q.remove();
        while(!q.isEmpty()){
                root.left=null;
                TreeNode r=new TreeNode(q.remove());
                root.right=r;
                root=root.right;
        }
    }
    void help(Queue<Integer> q,TreeNode root) {
            if(root==null){
                    return;
            }
            q.add(root.val);
            help(q,root.left);
            help(q,root.right);
            return;
    }
}