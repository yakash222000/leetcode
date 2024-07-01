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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp1 = l1;
        ListNode temp2 = l2;
        ListNode dummy = new ListNode(-1);
        ListNode curr=dummy;
        int carry=0,sum=0;
        while(temp1!=null && temp2!=null){
            sum=temp1.val+temp2.val+carry;
            carry=sum/10;
            sum%=10;
            ListNode temp = new ListNode(sum);
            curr.next=temp;
            curr=curr.next;
            
            temp1=temp1.next;
            temp2=temp2.next;
            
        }
        while(temp1!=null){
            sum=temp1.val+carry;
            carry=sum/10;
            sum%=10;
            ListNode temp = new ListNode(sum);
            curr.next=temp;
            curr=curr.next;
            
            temp1=temp1.next;
        }
        
        while(temp2!=null){
            sum=temp2.val+carry;
            carry=sum/10;
            sum%=10;
            ListNode temp = new ListNode(sum);
            curr.next=temp;
            curr=curr.next;
            
            temp2=temp2.next;
        }
        if(carry==1) {
            ListNode temp = new ListNode(carry);
            curr.next=temp;
            
        }
        return dummy.next;
    }
}