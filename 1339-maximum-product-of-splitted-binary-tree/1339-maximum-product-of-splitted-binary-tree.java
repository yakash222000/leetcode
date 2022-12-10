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
        int mod=1000000007;
        long ans=0;
    public int maxProduct(TreeNode root) {
        long sum=help(root);
        //System.out.println(sum);
        help1(sum,root);
        return (int)(ans%mod);
    }
    public long help(TreeNode node ) {
            if(node==null) return 0;
            return node.val+=help(node.left)+help(node.right);        
    } 
    void help1(long sum,TreeNode node) {
            if(node==null) return ;
            ans=Math.max(ans,node.val*(sum-node.val));
            help1(sum,node.left);
            help1(sum,node.right);
    }
}