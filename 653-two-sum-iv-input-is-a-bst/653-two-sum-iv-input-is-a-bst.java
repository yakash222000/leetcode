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
        static boolean t =false;
    public boolean findTarget(TreeNode root, int k) {
        HashSet<Integer> set = new HashSet<>();
        t =false;
        help(root,set,k);
        return t;
    }
    public static void help(TreeNode node,HashSet<Integer> set,int k){
            if(node == null)return;
            if(set.contains(k-node.val)){
                    t=true;
            }
            else{
                    set.add(node.val);
            }
            help(node.left,set,k);
            help(node.right,set,k);
            return;
    }
}