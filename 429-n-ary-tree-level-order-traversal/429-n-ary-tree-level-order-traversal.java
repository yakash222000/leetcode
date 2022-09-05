/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> res = new ArrayList<>();
            if(root==null) return res;
            help(root,0,res);
            return res;
    }
    public void help(Node root,int row,List<List<Integer>> res){
            if(root==null) return;
            
            if(row==res.size()){
                    res.add(new ArrayList<>());
            }
            res.get(row).add(root.val);
            
            for(Node temp : root.children){
                    help(temp,row+1,res);
            }
    }

}