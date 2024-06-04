class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int low=1,high=1;
        for(int i : nums){
            high=Math.max(high,i);
        }
        int ans=Integer.MAX_VALUE;
        while(low<=high){
            int mid  =(low+high)/2;
            if(check(nums,threshold,mid)){
                ans=Math.min(ans,mid);
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    
    public boolean check(int[] nums,int t,int mid){
        int sum=0;
        for(int i : nums){
            sum=sum+i/mid+((i%mid==0)?0:1);
        }
        if(sum>t) return false;
        return true;
    }
}