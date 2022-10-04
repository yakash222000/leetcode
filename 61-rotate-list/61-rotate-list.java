/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        int n =sizeList(head);
        if(n==0||k%n==0)return head;
        k=n-k%n;
        ListNode curr=head,prev=head;
        while(k-->0){
              prev=curr;
              curr=curr.next;
        }
        prev.next=null;
        ListNode res=curr;
        while(curr.next!=null){
                curr=curr.next;
        }
        curr.next=head;
        //System.out.println(curr.val+" "+prev.val);
        return res;
    }
    
    
        
        
        
        
        
        
        
        
        
        
        
        int sizeList(ListNode node){
            int res=0;
            while(node!=null){
                    res++;
                    node=node.next;
            }
            return res;
    }
}