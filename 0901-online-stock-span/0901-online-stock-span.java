class StockSpanner {
    ListNode head=null;
    public StockSpanner() {
        
    }
    
    public int next(int price) {
        ListNode node = new ListNode(price,null,head);
        head=node;
        ListNode temp=head;
        int count=0;
        while(temp!=null && temp.val<=head.val){
                temp=temp.prev;
                count++;
        }
        return count;
    }
}
public class ListNode {
      int val;
      ListNode next;
      ListNode prev;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next ,ListNode prev) { 
              this.val = val; this.next = next; this.prev=prev; }
  }

/*
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */