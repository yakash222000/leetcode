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
    int sum=0;
    int index=0;
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        ArrayList<List<Integer>> ans = new ArrayList<List<Integer>>();
        if(root==null) return ans;
        ArrayList<Integer> ans1 = new ArrayList<>();
        //ans1.add(root.val);
        //sum+=root.val;
        path(root,ans,ans1,sum,targetSum);
        return ans;
            
    }
        
    public void path(TreeNode node ,ArrayList<List<Integer>> ans,
                           ArrayList<Integer> ans1,int sum,int targetSum) {
            if(node.left==null && node.right==null) {
                    sum+=node.val;
                    ans1.add(node.val);
                    if(sum==targetSum){
                            ans.add(new ArrayList<Integer>(ans1));
                    }
                    //System.out.println(ans1+"  "+sum+"  "+targetSum);
                    sum-=node.val;
                    index = ans1.size() - 1;
                    if(index>=0)ans1.remove(index);
                    
                    return ;
            }
            ans1.add(node.val);
            sum+=node.val;
            if(node.left!=null)path(node.left,ans,ans1,sum,targetSum);
            if(node.right!=null)path(node.right,ans,ans1,sum,targetSum);
            index = ans1.size() - 1;
            if(index>=0)ans1.remove(index);
            sum-=node.val;
            
            return;
            
            
    }
    
}