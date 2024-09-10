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
    
    public int gcd(int a, int b) {
        if(b == 0) return a;
        return gcd(b,Math.abs(a-b));
    }
    
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if( head == null || head.next==null) return head;
        ListNode first = head, second = head.next;
        while(second!=null) {
            ListNode node = new ListNode(gcd(first.val,second.val));
            first.next = node;
            node.next = second;
            first = second;
            second = second.next;
        }
        return head;
    }
    
    
}