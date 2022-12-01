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
    public boolean isEvenOddTree(TreeNode root) {
        if(root!=null){
                if(root.val%2==0) return false;
        }
        int level=1;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()) {
                int size=q.size();
                if(level%2==0){
                        int min =0;
                        for(int i=0;i<size;i++){
                                TreeNode t = q.poll();
                                //System.out.println(t.val);
                                if(t.left!=null){
                                     if(t.left.val%2==0 || t.left.val<=min) return false;
                                     else {
                                        min=t.left.val;
                                        q.offer(t.left);
                                     }
                                }
                                if(t.right!=null){
                                     if(t.right.val%2==0 || t.right.val<=min) return false;
                                     else {
                                        min=t.right.val;
                                        q.offer(t.right);
                                     }
                                }
                        }        
                }
                else{
                        int max =10000000;
                        for(int i=0;i<size;i++){
                                TreeNode t = q.poll();
                                //System.out.println(t.val);
                        if(t.left!=null){
                                if(t.left.val%2!=0 || t.left.val>=max) return false;
                                else {
                                        max=t.left.val;
                                        q.offer(t.left);
                                }
                        }
                        if(t.right!=null){
                                if(t.right.val%2!=0 || t.right.val>=max) return false;
                                else {
                                        max=t.right.val;
                                        q.offer(t.right);
                                }
                        }
                        }   
                        
                }
                
                level++;
        }
        return true;
        
    }
}