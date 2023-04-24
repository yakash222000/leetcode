class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i : stones){
            pq.add(i);
        }
        while(pq.size()>1){
            int first = pq.remove();
            int second = pq.remove();
            if(first>second){
                pq.add(first-second);
            }
            else if(second>first){
                pq.add(second-first);
            }
            else {
                pq.add(0);  
            }
        }
        return pq.remove();
    }
}