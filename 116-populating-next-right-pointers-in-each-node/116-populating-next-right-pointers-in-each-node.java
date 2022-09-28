/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if(root==null) return null;
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        Node p=root;
        while(!q.isEmpty()){
                int n=q.size(),i;
                for(i=0;i<n;i++){
                        p=q.remove();
                        if(p.left!=null) q.add(p.left);
                        if(p.right!=null) q.add(p.right);
                        if(i==n-1){
                                p.next=null;
                        }
                        else{
                                p.next=q.peek();
                        }
                }
        }
            return root;
    }
}