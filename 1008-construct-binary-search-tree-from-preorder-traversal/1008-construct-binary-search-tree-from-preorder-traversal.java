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
    TreeNode ans;
    public TreeNode bstFromPreorder(int[] preorder) {
        for(int i : preorder) {
                insert(i,ans);
        }
        return ans;
    }
    public void insert(int x ,TreeNode node) {
            if(node == null) {
                    ans = new TreeNode(x);
                    return;
            }
            int temp=0;
            TreeNode prev=node;
            while(node != null){
                    prev=node;
                    if(node.val>x){
                            node=node.left;
                            temp=0;
                    }
                    else{
                            node=node.right;
                            temp=1;
                    }
            }
            TreeNode n = new TreeNode(x);
            if(temp==0) prev.left=n;
            else prev.right=n;
    }
    
}