class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] res = new int[k];
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        HashMap<Integer ,Integer > map = new HashMap<>();
        for(int i : nums) {
                map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i : map.keySet()){
                if(pq.size()==k){
                        if(map.get(i)>pq.peek()){
                                pq.poll();
                                pq.add(map.get(i));
                        }      
                }
                else{
                        pq.add(map.get(i));
                }
        }
        int ind=0;
        for(int i : map.keySet()){
                if(map.get(i)>=pq.peek())res[ind++]=i;
        }
            return res;
        
        
        
    }
}