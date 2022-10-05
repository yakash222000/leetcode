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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode temp1=list1,temp2;
        int n=1;
        while(n++!=a){
                temp1=temp1.next;
        }
        temp2=temp1;
        while(n++!=b+2){
                temp1=temp1.next;
        }
        //System.out.print(temp2.val+" "+temp1.val);
        
        temp2.next=list2;
        while(list2.next!=null){
                list2=list2.next;
        }
        list2.next=temp1.next;
        return list1;
            
        
        
    }
}