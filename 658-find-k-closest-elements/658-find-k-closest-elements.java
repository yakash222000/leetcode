class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> ans = new ArrayList<>();
        PriorityQueue<Integer> pq=new PriorityQueue<>();
            for(int i:arr){
                    if(k>0){
                            pq.add(i);
                            k--;
                    }
                    else {
                            if(Math.abs(x-pq.peek())>Math.abs(x-i)){
                                    pq.poll();
                                    pq.add(i);
                            }
                    }
            }
            while(!pq.isEmpty()){
                    ans.add(pq.poll());
            }
            Collections.sort(ans);
            return ans;
    }
}