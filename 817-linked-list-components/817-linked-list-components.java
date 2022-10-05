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
    public int numComponents(ListNode head, int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums){
                set.add(i);
        }
        boolean check=false;
        int res=0;
        while(head!=null){
                if(!set.contains(head.val))check=false;
                if(set.contains(head.val) && check==false){
                        res++;
                        check=true;
                }
                head=head.next;       
        }
            return res;
    }
}