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
    public List<TreeNode> allPossibleFBT(int n) {
        if(n==1) {
                List<TreeNode> ans = new ArrayList<>();
                ans.add(new TreeNode(0));
                return ans;
        }
        List<TreeNode> ans = new ArrayList<>();
        for(int i=1;i<n;i+=2){
                List<TreeNode> left = allPossibleFBT(i);
                List<TreeNode> right = allPossibleFBT(n-i-1);
                for(int j=0;j<left.size();j++){
                        for(int k =0;k<right.size();k++){
                                TreeNode node = new TreeNode(0);
                                node.left=left.get(j);
                                node.right=right.get(k);
                                ans.add(node);
                        }
                }     
        }
        return ans;
        
    }
}