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
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        ArrayList<TreeNode> ans = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for(int i : to_delete) {
                set.add(i);
        }
        if(help(ans,root,set)!=null)
        ans.add(root);
        return ans;
    }
    public TreeNode help(ArrayList<TreeNode> ans, TreeNode root,HashSet<Integer> set){
            if(root==null) return null;
            root.left=help(ans,root.left,set);
            root.right=help(ans,root.right,set);
            if(set.contains(root.val)){
                    if(root.right!=null){
                            ans.add(root.right);
                    }
                    if(root.left!=null){
                            ans.add(root.left);
                    }
                    return null;
            }
            else{
                    return root;
            }
    }
}