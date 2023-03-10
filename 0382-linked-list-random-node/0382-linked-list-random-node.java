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
    int len=0;
    ListNode curr = null;

    public Solution(ListNode head) {
        curr=head;
        while(head != null ){
            
            head=head.next;
            len++;
        }
    }
    
    public int getRandom() {
        Random rn = new Random();
        int num = rn.nextInt(len)+1;
        int count=1;
        ListNode temp=curr;
        while(count!=num){
            count++;
            temp=temp.next;
        }
        //System.out.println(num+"   "+len);
        return temp.val;
        
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */