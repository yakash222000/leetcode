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
        if(head == null) return head;
        ListNode p,q;
        p=head;
        q=head.next;
        while(q!=null) {
               if(p.val==q.val) {
                       p.next=q.next;
                       q=q.next;
               }
               else{
                       p=p.next;
                       q=q.next;
                        
               }
        }
        return head;
    }
}