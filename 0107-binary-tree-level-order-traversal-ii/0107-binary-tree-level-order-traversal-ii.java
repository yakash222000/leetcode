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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null) return ans;
        while(!q.isEmpty()) {
                int size=q.size();
                ArrayList<Integer> res = new ArrayList<>();
                for(int i=0;i<size;i++){
                        TreeNode t=q.remove();
                        if(t.left!=null) q.add(t.left);
                        if(t.right!=null) q.add(t.right);
                        res.add(t.val);
                }
                ans.add(res);
        }
        List<List<Integer>> ans1 = new ArrayList<>();
        for(int i=ans.size()-1;i>=0;i--){
                ans1.add(ans.get(i));
        }
        return ans1;
    }
}