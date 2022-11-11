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
    TreeMap<Integer,Integer> map = new TreeMap<>();
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        traverse(root1);
        traverse(root2);
        List<Integer> ans = new ArrayList<>();
        for(int k : map.keySet()){
                while(map.get(k)>0){
                        ans.add(k);
                        map.put(k,map.get(k)-1);
                }
        }
        return ans;     
    }
    void traverse(TreeNode node){
            if(node == null) return;
            map.put(node.val,map.getOrDefault(node.val,0)+1);
            traverse(node.left);
            traverse(node.right);
    }
}