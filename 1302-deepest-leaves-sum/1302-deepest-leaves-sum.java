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
        int max=1;
    public int deepestLeavesSum(TreeNode root) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int lvl=1;
            help(root,lvl,map);
            return map.get(max);
    }
     void help(TreeNode root,int lvl , HashMap<Integer,Integer> map) {
             if(root==null) return ;
             max=Math.max(max,lvl);
             map.put(lvl,map.getOrDefault(lvl,0)+root.val);
             lvl++;
             
             help(root.left,lvl,map);
             help(root.right,lvl,map);
             return ;
     }
}