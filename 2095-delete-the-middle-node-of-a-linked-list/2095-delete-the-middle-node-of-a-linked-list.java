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
    public ListNode deleteMiddle(ListNode head) {
        if(head==null || head.next==null) return null;
        int n=size(head)/2;
        ListNode curr=head;
        while(n-->1){
                curr=curr.next;
        }
        curr.next=curr.next.next;
            return head;
    }
    int size(ListNode head) {
            int res=0;
            while(head!=null){
                    res++;
                    head=head.next;
            }
            return res;
    }
}