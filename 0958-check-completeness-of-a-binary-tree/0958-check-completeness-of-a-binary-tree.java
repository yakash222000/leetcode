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
    public boolean isCompleteTree(TreeNode root) {
        if(root == null) return true;
        Queue<TreeNode> q = new LinkedList<>();
        int check = 0;
        q.add(root);
        while(!q.isEmpty()){
            int n = q.size();
            for(int i =0 ;i<n;i++){
                TreeNode temp = q.poll();
                if(temp.left == null){
                    check =1;
                }
                if(temp.left != null ){
                    if(check != 0) return false;
                    q.add(temp.left);
                }
                if(temp.right == null){
                    check =1;
                }
                if(temp.right != null ){
                    if(check != 0 ) return false;
                    q.add(temp.right);
                }
            }
        }
        return true;
    }
}