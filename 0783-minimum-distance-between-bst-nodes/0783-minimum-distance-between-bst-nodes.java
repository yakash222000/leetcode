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
        int ans = Integer.MAX_VALUE;
    public int minDiffInBST(TreeNode root) {
        ArrayList<Integer> arr = new ArrayList<>();
        dfs(root,arr);
        return ans;
    }
    void dfs(TreeNode node ,ArrayList<Integer> arr){
            if(node == null )return;
            dfs(node.left,arr);
            if(arr.size()>0){
                    ans = Math.min(Math.abs(arr.get(arr.size()-1)-node.val),ans);
            }
            arr.add(node.val);
            int curr = node.val;
            dfs(node.right,arr);
            
    }
}