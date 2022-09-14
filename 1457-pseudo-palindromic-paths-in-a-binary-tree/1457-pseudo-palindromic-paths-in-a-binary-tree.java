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
        int res=0;
    public int pseudoPalindromicPaths (TreeNode root) {
        int[] arr = new int[10];
        help(arr,root);
            return res;
    }
    private void help(int[] arr , TreeNode root){
            if(root== null) return ;
            if(root.right==null && root.left==null){
                    arr[root.val]++;
                    int temp=0;
                    for(int i=1;i<=9;i++){
                            if(arr[i]%2!=0){
                                    temp++;
                            }
                    }
                    if(temp<=1) res++;
                    arr[root.val]--;
                    return;
            }
            arr[root.val]++;
            help(arr,root.left);
            help(arr,root.right);
            arr[root.val]--;
    }    
}