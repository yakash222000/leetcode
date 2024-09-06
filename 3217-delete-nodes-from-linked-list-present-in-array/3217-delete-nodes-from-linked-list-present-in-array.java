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
    public ListNode modifiedList(int[] arr, ListNode head) {
        ListNode dummy = new ListNode(-1, head);
        if(head == null) return null;
        HashSet<Integer> set = new HashSet<Integer>();
        for(int  i : arr) set.add(i);
        ListNode prev = dummy, curr = head, next = head.next;
        while(curr!=null) {
            if(set.contains(curr.val)) {
                prev.next = curr.next;
                curr = curr.next;
                if(curr == null) break;
                next = curr.next;
            }
            else {
                prev = curr;
                curr = next;
                if(curr == null) break;
                next = curr.next;
            }
        }
        return dummy.next;
    }
}