class CustomStack {

    int[] stack;
    int front;
    int capacity;
    
    public CustomStack(int maxSize) {
        stack = new int[maxSize];
        capacity = maxSize;
        front = -1;
    }
    
    public void push(int x) {
        if(front == capacity-1) return;
        front++;
        stack[front] = x;
        
    }
    
    public int pop() {
        if(front == -1) return -1;
        int val = stack[front];
        front--;
        return val;
    }
    
    public void increment(int k, int val) {
        for(int i=0;i<=front && i<k;i++) {
            stack[i] += val;
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */