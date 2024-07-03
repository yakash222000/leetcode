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
        int len=0;
        ListNode node = head;
        if(node==null || node.next==null) return head;
        while(node!=null){
            len++;
            node=node.next;
        }
        k%=len;
        if(k==0) return head;
        ListNode slow=head,fast=head;
        while(k-->0){
            fast=fast.next;
        }
        while(fast.next!=null) {
            slow=slow.next;
            fast=fast.next;
        }
        ListNode ans=slow.next;
        fast.next=head;
        slow.next=null;
        return ans;
    }
}