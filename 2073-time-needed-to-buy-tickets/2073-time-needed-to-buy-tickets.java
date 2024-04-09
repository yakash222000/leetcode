class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int n=tickets[k],time=0;
            for(int i=0;i<tickets.length;i++){
                  if(tickets[i]<=n && i<=k)
                          time+=tickets[i];
                  if(tickets[i]>n && i<=k)
                          time+=n;
                  if(tickets[i]>=n && i>k)
                          time+=n-1;
                  if(tickets[i]<n && i>k)
                          time+=tickets[i];
            }
                     return time;
    }
}