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
        ArrayList<Integer> arr = new ArrayList<>();
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        help(root1);
        help(root2);
        //System.out.println(arr);
        if(arr.size()%2!=0) return false;
        for(int i=0;i<arr.size()/2;i++){
                if(arr.get(i)!=arr.get(arr.size()/2+i)) return false;
        }
        return true;
    }
    public void help(TreeNode node) {
            if(node == null) return ;
            if(node.left==null && node.right==null) arr.add(node.val);
            help(node.left);
            help(node.right);
    }
}