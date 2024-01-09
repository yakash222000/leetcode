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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        
        find(root1,arr1);
        find(root2,arr2);
        if(arr1.size()!=arr2.size()) return false;
        for(int i=0;i<arr1.size();i++){
            if(arr1.get(i)!=arr2.get(i)) return false;
        }
        return true;
    }
    public void find(TreeNode node,ArrayList<Integer> arr){
        if(node == null) return;
        if(node.left == null && node.right == null) arr.add(node.val);
        find(node.left,arr);
        find(node.right,arr);
    }
}