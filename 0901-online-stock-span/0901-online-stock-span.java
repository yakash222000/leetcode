class StockSpanner {
    private Deque<int[]> stack = new LinkedList<>();
    public StockSpanner() {
        
    }
    
    public int next(int price) {
        int tot=1;
        while(!stack.isEmpty() && stack.peek()[1]<=price){
            tot+=stack.pop()[0];
        }
        stack.push(new int[]{tot,price});
        return tot;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */