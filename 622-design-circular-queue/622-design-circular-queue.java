class MyCircularQueue {

    public MyCircularQueue(int k) {
        q=new int[k];
        count=0;
        size=k;
        headIndex=0;
    }
    
    public boolean enQueue(int value) {
        if(isFull()) return false;
        q[(headIndex+count)%size]=value;
        count++;
        return true;    
    }
    
    public boolean deQueue() {
        if(isEmpty())return false;
        headIndex=(headIndex+1)%size;
        count--;
        return true;
    }
    
    public int Front() {
        if(isEmpty())return -1;
        return q[headIndex];
    }
    
    public int Rear() {
        if(isEmpty())return -1;
        return q[(headIndex+count-1)%size];
    }
    
    public boolean isEmpty() {
        return count==0;
    }
    
    public boolean isFull() {
        return count==size;
    }
    private int[] q;
    private int headIndex, count, size;
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */