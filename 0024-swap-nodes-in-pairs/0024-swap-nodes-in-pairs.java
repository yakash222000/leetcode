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
        ListNode dummy = new ListNode(1,head);
        if(head == null || head.next == null) return head;
        ListNode temp1 = head,temp2 = head.next,prev = dummy;
        while(temp1 != null && temp2 != null ){
            temp1.next = temp2.next;
            prev.next = temp2;
            temp2.next = temp1; 
            prev = temp1;
            temp1 = temp1.next;
            if(temp1!=null)temp2 = temp1.next;
            else break;
        }
        return dummy.next;
    }
}