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
    public ListNode reverseKGroup(ListNode head, int k) {
       if (head==null||head.next==null||k<2) return head;   
            ListNode dummy = new ListNode(0);
            dummy.next = head;          
            ListNode tail = dummy, prev = dummy,temp;
            int count;
            while(true){
                count =k;
                while(count>0&&tail!=null){
                    count--;
                    tail=tail.next;
                } 
                if (tail==null) break;
                head=prev.next;
                while(prev.next!=tail){
                    temp=prev.next;
                    prev.next=temp.next;
                    
                    temp.next=tail.next;
                    tail.next=temp;                
                }         
                tail=head;
                prev=head;
                
            }
            return dummy.next;
    }
}