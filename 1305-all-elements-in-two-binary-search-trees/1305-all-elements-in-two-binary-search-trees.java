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
    //HashMap<Integer,Integer> map = new HashMap<>();
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> ans = new ArrayList<>();
        traverse(root1,ans);
        traverse(root2,ans);    
        Collections.sort(ans);
        return ans;     
    }
    public void traverse(TreeNode node,List<Integer> ans){
            if(node == null) return;
            //map.put(node.val,map.getOrDefault(node.val,0)+1);
            ans.add(node.val);
            traverse(node.left,ans);
            traverse(node.right,ans);
    }
}