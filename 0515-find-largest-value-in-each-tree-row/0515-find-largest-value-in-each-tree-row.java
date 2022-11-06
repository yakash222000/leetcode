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
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if(root==null) return res;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int max=Integer.MIN_VALUE;
        while(!q.isEmpty()){
                max=Integer.MIN_VALUE;
                int n=q.size();
                for(int i=0;i<n;i++){
                        TreeNode node =q.remove();
                        if(node.left!=null)q.add(node.left);
                        if(node.right!=null)q.add(node.right);
                        max=Math.max(max,node.val);
                }
                res.add(max);
        }
        return res;
    }
}