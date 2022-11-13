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
    public int[] findFrequentTreeSum(TreeNode root) {
        HashMap<Integer,Integer> map = new HashMap<>();
        help(map,root);
        //System.out.println(map);
        int max=0;
        for(int k : map.keySet()){
                max=Math.max(max,map.get(k));
        }
        int count=0;
        for(int k : map.keySet()){
                if(max==map.get(k)) count++;
        }
        int[] ans = new int[count];
        count=0;
        for(int k : map.keySet()){
                if(max==map.get(k)) ans[count++]=k;
        }
            return ans;
        
        
        
    }
    public int help(HashMap<Integer,Integer> map,TreeNode node){
            if(node==null) return 0;
            int left = help(map,node.left);
            int right = help(map,node.right);
            int sum = node.val +left + right;
            map.put(sum,map.getOrDefault(sum,0)+1);
            return sum;
    }
}