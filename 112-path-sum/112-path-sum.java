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
        static boolean result=false;
    public boolean hasPathSum(TreeNode root, int targetSum) {
        int sum=0;
        if(root==null) return false;
        result=false;
        traverseTree(root,targetSum,sum);
        return result;
    }
    static void traverseTree(TreeNode node ,int targetSum,int sum) {
            if(node.left==null && node.right==null) {
                    sum+=node.val;
                    if(sum==targetSum) {
                            result=true;
                    }
                    //System.out.println(sum);
                    sum-=node.val;
                    
                    return;
            }
            sum+=node.val;
            //System.out.println(sum);
            if(node.left!=null) traverseTree(node.left,targetSum,sum);
            if(node.right!=null) traverseTree(node.right,targetSum,sum);
            sum-=node.val;
            return;
    }
        
}