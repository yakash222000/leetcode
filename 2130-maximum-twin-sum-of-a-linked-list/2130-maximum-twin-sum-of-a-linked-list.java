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
    public int pairSum(ListNode head) {
        ListNode p=head;
            int n=0;
            while(p!=null) {
                    n++;
                    p=p.next;
            }
            int[] arr = new int[n/2];
            int res=0;
            n=n/2;
            n--;
            p=head;
            while(n>=0) {
                arr[n--]=p.val;
                p=p.next;  
            }
            n++;
            while(p!=null) {
                res=Math.max(res,arr[n++]+p.val);
                    p=p.next;
            }
            return res;
    }
}