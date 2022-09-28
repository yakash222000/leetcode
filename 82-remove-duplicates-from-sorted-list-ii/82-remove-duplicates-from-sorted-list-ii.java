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
    public ListNode deleteDuplicates(ListNode head) {
           if(head==null || head.next==null) return head;
           ListNode dummy = new ListNode(-1,head);
           ListNode p=dummy,q=head,r=head.next;
           while(r!=null) {
                   if(q.val==r.val){
                           while(r!=null && q.val==r.val) {
                                   r=r.next;
                           }
                           if(r==null){
                                   p.next=null;
                                   return dummy.next;
                           }
                           p.next=r;
                           q=r;
                           r=r.next;
                   }
                   else{
                           p=q;
                           q=r;
                           r=r.next;
                   }
           }
            return dummy.next;
    }
}