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
    public ListNode removeZeroSumSublists(ListNode head) {
        HashMap<Integer,ListNode> map = new HashMap<>();
        ListNode dummy = new ListNode(0,head);
        ListNode temp=head;
        int sum=0;
        map.put(0,dummy);
        while(temp!=null) {
               sum+=temp.val;
               if(map.containsKey(sum)) {
                       ListNode temp2=map.get(sum);
                       int sumtemp=sum;
                       while(temp2!=temp){
                               temp2=temp2.next;
                               sumtemp+=temp2.val;
                              if(sum!=sumtemp)map.remove(sumtemp);
                       }
                       map.get(sum).next=temp.next;
                       
               }
               else {
                       map.put(sum,temp);
               }
                temp=temp.next;
        }
        return dummy.next;
    }
}