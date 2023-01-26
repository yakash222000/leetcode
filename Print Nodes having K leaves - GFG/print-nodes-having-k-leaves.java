//{ Driver Code Starts
//Initial Template for Java

import java.util.LinkedList; 
import java.util.Queue; 
import java.io.*;
import java.util.*;

class Node
{
    int data;
    Node left;
    Node right;
    Node(int data)
    {
        this.data = data;
        left=null;
        right=null;
    }
}

class Main
{
    static Node buildTree(String str)
    {
        
        if(str.length()==0 || str.charAt(0)=='N'){
            return null;
        }
        
        String ip[] = str.split(" ");
        // Create the root of the tree
        Node root = new Node(Integer.parseInt(ip[0]));
        // Push the root to the queue
        
        Queue<Node> queue = new LinkedList<>(); 
        
        queue.add(root);
        // Starting from the second element
        
        int i = 1;
        while(queue.size()>0 && i < ip.length) {
            
            // Get and remove the front of the queue
            Node currNode = queue.peek();
            queue.remove();
                
            // Get the current node's value from the string
            String currVal = ip[i];
                
            // If the left child is not null
            if(!currVal.equals("N")) {
                    
                // Create the left child for the current node
                currNode.left = new Node(Integer.parseInt(currVal));
                // Push it to the queue
                queue.add(currNode.left);
            }
                
            // For the right child
            i++;
            if(i >= ip.length)
                break;
                
            currVal = ip[i];
                
            // If the right child is not null
            if(!currVal.equals("N")) {
                    
                // Create the right child for the current node
                currNode.right = new Node(Integer.parseInt(currVal));
                    
                // Push it to the queue
                queue.add(currNode.right);
            }
            i++;
        }
        
        return root;
    }
    
    public static void main (String[] args) throws IOException
    {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int t=Integer.parseInt(br.readLine());
        
        while(t-- > 0)
        {
            int k=Integer.parseInt(br.readLine());
            
            String s = br.readLine();
            Node root = buildTree(s);
            
            Solution g = new Solution();
            ArrayList<Integer> nodes = g.btWithKleaves(root,k);
            for(int i = 0;i<nodes.size();i++){
                System.out.print(nodes.get(i)+ " ");
            }
            System.out.println();
        }
	}
}


// } Driver Code Ends


//User function Template for Java

/*Complete the function below
Node is as follows:
class Node{
	int data;
	Node left,right;
	Node(int d){
		data=d;
		left=right=null;
	}
}*/

class Solution
{
    public ArrayList<Integer> btWithKleaves(Node root, int k)
    {
        ArrayList<Integer> ans = new ArrayList<>();
        help(ans,root,k);
        if(ans.size()==0) ans.add(-1);
        return ans;
    }
    
    int help(ArrayList<Integer> ans,Node node ,int k){
        if(node==null) return 0;
        if(node.left==null && node.right==null) return 1;
        int count =0,left=0,right=0;
        if(node.left!=null) {
            left = help(ans,node.left,k);
            count+=left;
        }
        if(node.right!=null) {
            right = help(ans,node.right,k);
            count+=right;
        }
        if(count==k) ans.add(node.data);
        return count;
        
        
    }
    
}