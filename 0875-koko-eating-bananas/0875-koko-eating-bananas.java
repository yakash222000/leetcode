class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1,high=0;
        for(int i : piles){
            high = Math.max(i,high);
        }
        
        while(low<high){
            int mid=low+(high-low)/2;
            if(check(piles,h,mid)){
                high = mid;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
    
    public boolean check(int[] piles ,int h ,int mid){
        int count=0;
        for(int i : piles){
            count+=i/mid;
            if(i%mid>0) count++;
        }
        
        if(count<=h) return true;
        return false;
    }
}