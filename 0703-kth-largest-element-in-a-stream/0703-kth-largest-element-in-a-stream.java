class KthLargest {
PriorityQueue<Integer> pq = new PriorityQueue<>();
    int i=0;

    public KthLargest(int k, int[] nums) {
        i=k;
        for(int i : nums){
            pq.add(i);
        }
    }
    
    public int add(int val) {
        int j=i;
        pq.add(val);
        while (pq.size()>j){
            pq.poll();
        }
        //System.out.println();
        return pq.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */