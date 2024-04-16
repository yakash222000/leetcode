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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(depth == 1){
            TreeNode newRoot = new TreeNode(val, root, null);
            return newRoot;
        }else{
            Queue<TreeNode> q = new LinkedList<>();
            int d = 1;
            q.add(root);
            while(d<depth-1){
                int size = q.size();
                int processedNodes = 0;
                while(processedNodes<size){
                    TreeNode curr = q.poll();
                    if(curr.left!=null) q.add(curr.left);
                    if(curr.right!=null) q.add(curr.right);
                    processedNodes++;
                }
                d++;
            }
            
            for(TreeNode node: q){
                TreeNode currLeft = node.left;
                TreeNode currRight = node.right;
                
                TreeNode newNodeLeft = new TreeNode(val);
                node.left = newNodeLeft;
                if(currLeft!=null){
                    newNodeLeft.left = currLeft;
                }
                TreeNode newNodeRight = new TreeNode(val);
                node.right = newNodeRight;
                if(currRight != null){
                    newNodeRight.right = currRight;
                }
            }
            
        }
        return root;
    }
}