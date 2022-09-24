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
    public ListNode swapNodes(ListNode head, int k) {
        int n=1,temp=0;
            ListNode p=head,first=head,second=head;
            while(p!=null) {
                    n++;
                    p=p.next;
                    if(n==k){
                            first=p;
                    }
            }
            p=head;
            int n2=0;
            while(p!=null){
                    n2++;
                    p=p.next;
                    if(n2==n-k-1){
                          second=p;  
                    }
            }
            temp=first.val;
            first.val=second.val;
            second.val=temp;
            return head;
    }
}