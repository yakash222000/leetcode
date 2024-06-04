class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if(bloomDay.length<m*k) return -1;
        int low=1,high=1;
        for(int i : bloomDay){
            high= Math.max(i,high);
        }
        int ans = Integer.MAX_VALUE;
        while(low<=high){
            int mid = (low+high)/2;
            if(check(bloomDay,m,k,mid)){
                ans=Math.min(ans,mid);
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        if(ans==Integer.MAX_VALUE) return -1;
        return ans;
    }
    
    public boolean check(int[] arr,int m ,int k,int mid){
        int count=0;
        int countdays=0;
        for(int i : arr){
            if(i<=mid){
                countdays++;
                if(countdays==k){
                    count++;
                    countdays=0;
                }
            }
            else{
                countdays=0;
            }
        }
        if(m<=count) return true;
        return false;
    }
}