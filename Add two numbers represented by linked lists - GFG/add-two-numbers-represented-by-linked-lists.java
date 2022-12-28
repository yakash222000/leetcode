//{ Driver Code Starts
// driver

import java.util.*;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class GfG{
    
    static void printList(Node n){
        while(n!=null){
            System.out.print(n.data+" ");
            n = n.next;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        while (T-- > 0) {
            
            int n = sc.nextInt();
            int val = sc.nextInt();
            
            Node first = new Node(val);
            Node tail = first;
            for(int i=0; i<n-1; i++)
            {
                val = sc.nextInt();
                tail.next = new Node(val);
                tail = tail.next;
            }
            
            int m = sc.nextInt();
            val = sc.nextInt();
            
            Node second = new Node(val);
            tail = second;
            for(int i=0; i<m-1; i++)
            {
                val = sc.nextInt();
                tail.next = new Node(val);
                tail = tail.next;
            }
            
            Solution g = new Solution();
            Node res = g.addTwoLists(first, second);
            printList(res);
        }
    }
}

// } Driver Code Ends


/* node for linked list

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

*/

class Solution{
    //Function to add two numbers represented by linked list.
    static Node addTwoLists(Node first, Node second){
        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();
        while(first!=null){
            st1.push(first.data);
            first=first.next;
        }
        while(second!=null){
            st2.push(second.data);
            second=second.next;
        }
        Node node=null,temp=null;
        int carry=0;
        while(!st1.isEmpty() && !st2.isEmpty()){
            int curr = carry+st1.pop()+st2.pop();
            if(curr>9) carry=1;
            else carry=0;
            int num=curr%10;
            temp = new Node(num);
            temp.next=node;
            node=temp;
        }
        while(!st1.isEmpty()){
            int curr = carry+st1.pop();
            if(curr>9) carry=1;
            else carry=0;
            int num=curr%10;
            temp = new Node(num);
            temp.next=node;
            node=temp;
        }
        while(!st2.isEmpty()){
            int curr = carry+st2.pop();
            if(curr>9) carry=1;
            else carry=0;
            int num=curr%10;
            temp = new Node(num);
            temp.next=node;
            node=temp;
        }
        if(carry==1){
            temp = new Node(1);
            temp.next=node;
            node=temp;
        }
        return temp;
    }
}