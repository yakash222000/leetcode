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
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int ans=0,max=Integer.MIN_VALUE,level=0;        
        while(!q.isEmpty()){
                level++;
                int n=q.size();
                int sum=0;
                for(int i=0;i<n;i++) {
                        TreeNode t=q.remove();
                        if(t.left!=null) q.add(t.left);
                        if(t.right!=null) q.add(t.right);
                        sum+=t.val;     
                }
                //System.out.println(sum+"  "+level);
                if(sum>max){
                        ans=level;
                        max=sum;
                }
        }
        return ans;
    }
}