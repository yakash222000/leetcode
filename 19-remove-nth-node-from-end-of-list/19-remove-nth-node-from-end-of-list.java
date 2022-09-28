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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count=0;    
        ListNode fast=head,slow=head,p=head;
            while(p!=null){
                    p=p.next;
                    count++;         
            }
            if(count==n) return fast.next;
            while(n-->0) {
                    fast=fast.next;
            }    
            while(fast.next!=null) {
                    fast=fast.next;
                    slow=slow.next;
            }
            slow.next=slow.next.next;
            return head;
    }
}