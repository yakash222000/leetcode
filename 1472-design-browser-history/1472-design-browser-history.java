class BrowserHistory {
    ListNode root = null,curr=null,last=null;

    public BrowserHistory(String homepage) {
        root = new ListNode(homepage,null,null);
        curr = root;
    }
    
    public void visit(String url) {
        ListNode temp = new ListNode(url,null,curr);
        curr.next = temp;
        curr = curr.next;    
    }
    
    public String back(int steps) {
        while(steps>0 && curr.prev!=null){
            curr = curr.prev;
            steps--;
        }
        return curr.val;
    }
    
    public String forward(int steps) {
        while(steps>0 && curr.next!=null){
            curr = curr.next;
            steps--;
        }
        return curr.val;
    }
}

public class ListNode {
      String val;
      ListNode next;
      ListNode prev;
      ListNode() {}
      ListNode(String val) { this.val = val; }
      ListNode(String val,ListNode next,ListNode prev) { 
          this.val = val;
          this.next = next;
          this.prev = prev;
      }
  }

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */