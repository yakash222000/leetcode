class Solution {
    public int minGroups(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> {
            if(a[0]==b[0]) return Integer.compare(a[1], b[1]);
            return Integer.compare(a[0], b[0]);
        });
        int max = 1;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int[] i : intervals) {
            if(pq.isEmpty()){
                pq.offer(i[1]);
            }
            else{
                if(pq.peek()<i[0]){
                    pq.poll();
                    pq.offer(i[1]);
                }
                else{
                    pq.offer(i[1]);
                }
            }
            max = Math.max(max, pq.size());
        }
        
        return max;
    }
}