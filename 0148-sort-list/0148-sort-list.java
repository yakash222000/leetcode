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
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null) return head;
        PriorityQueue<ListNode> pq = new PriorityQueue<>(
            (a, b) -> a.val - b.val);
        ListNode temp=head;
        while(temp!=null) {
                pq.offer(temp);
                temp=temp.next;
        }
        ListNode ans = new ListNode(-1,null);
        ListNode newNode=ans;
        while(!pq.isEmpty()){
                newNode.next = new ListNode(pq.poll().val);
                newNode=newNode.next;
        }
            return ans.next;
    }
}