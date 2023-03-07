class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        long low=Long.MAX_VALUE;
        long high=0;
        long min=Long.MAX_VALUE;
        for(int it:time){
            low=Math.min(low,it);
            min=Math.min(min,it);
        }
        high=totalTrips*min;
        while(low<high){
            long mid=low+(high-low)/2;
            if(check(mid,time,totalTrips)){
                high=mid;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
    
    public boolean check(long mid,int[] time,int total){
        long res =0;
        for(int it : time){
            res+=mid/it;
        }
        if(res>=total){
            return true;
        }
        return false;
    }
}