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
    ArrayList<Integer> res;
    public List<Integer> postorder(Node root) {
        res = new ArrayList<>();
        help(root);
        return res;
    }
    
    public void help(Node node) {
        if(node == null) return;
        for(Node n : node.children){
            help(n);
        }
        res.add(node.val);
    }
}