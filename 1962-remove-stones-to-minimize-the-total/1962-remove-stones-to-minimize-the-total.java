class Solution {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i : piles){
                pq.add(i);
        }
        for(int i=0;i<k;i++){
                int temp=pq.remove();
                if(temp%2==0) pq.add(temp/2);
                else pq.add(temp/2+1);
        }
        int res=0;
        while(!pq.isEmpty()){
                res+=pq.remove();
        }
        return res;
    }
}