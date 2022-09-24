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
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode p=head,q=head.next;
        while(p!=null && p.next!=null) {
                int temp=p.val;
                p.val=q.val;
                q.val=temp;
                p=q.next;
                if(p!=null)q=p.next;
                else break;
        }
        return head;
    }
}