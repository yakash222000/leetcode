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
    public ListNode removeNodes(ListNode head) {
            ListNode res = new ListNode(-1,head);
            ListNode temp=head;
            ArrayList<Integer> arr = new ArrayList<>();
            ArrayList<Integer> arr1 = new ArrayList<>();
            int max=0;
            while(temp!=null){
                    arr.add(temp.val);
                    temp=temp.next;
            }
            for(int i=arr.size()-1;i>=0;i--){
                    if(max<=arr.get(i)){
                             arr1.add(arr.get(i));
                            max=arr.get(i);
                    }
            }
            temp=res;
            for(int i=arr1.size()-1;i>=0;i--) {
                    //System.out.println(arr1.get(i));
                    res.next =new ListNode(arr1.get(i));
                    res=res.next;
                    
            }
            
            return temp.next;
        
    }
}