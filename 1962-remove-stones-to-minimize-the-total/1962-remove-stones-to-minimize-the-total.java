class Solution {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int total=0;
        for(int i : piles){
                pq.add(i);
                total+=i;
        }
        int res=0;
        for(int i=0;i<k;i++){
                int temp=pq.remove();
                res+=temp/2;
                if(temp%2==0) pq.add(temp/2);
                else pq.add(temp/2+1);
        }
        return total-res;
    }
}