/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    bool temp2 = true;
    bool isBalanced(TreeNode* root) {
        if(root == NULL){
            return true;
        }
      maxdepth(root);
      return temp2;     
            
    
     
        
        
        
    }
    int maxdepth(TreeNode* node){
        if(node == NULL){
            return 0;
        }
        int lft=maxdepth(node->left);
        int rgt=maxdepth(node->right);
            int temp =abs(lft-rgt);
            if(temp>1){
                    temp2=false;
            }
        
        return 1+max(lft,rgt);
    }
};