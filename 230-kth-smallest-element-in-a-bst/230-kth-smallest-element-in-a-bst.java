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
        int t=0;
    public int kthSmallest(TreeNode root, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
            help(root,pq,k);
            return pq.poll();
    }
    void help(TreeNode root,PriorityQueue<Integer> pq,int k) {
            if(root==null) return;
            if(t<k) {
                    t++;
                    pq.add(root.val);
            }
            else{
                    if(root.val<pq.peek()){
                            pq.poll();
                            pq.add(root.val);
                    }
            }
            help(root.left,pq,k);
            help(root.right,pq,k);
            return ;
    }
}