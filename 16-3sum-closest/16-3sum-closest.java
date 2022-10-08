class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);      
        int n=nums.length;
        int res=nums[0]+nums[1]+nums[n-1];
        for(int i=0;i<n-2;i++){
                //if(res==0) break;
                int start=i+1;
                int end=n-1;
                while(start<end){
                        int sum=nums[i]+nums[start]+nums[end];
                        if(target<sum){
                                end--;
                                
                        }
                        else {
                                start++;
                        }
                        if(Math.abs(sum-target)<Math.abs(res-target)){
                                res=sum;
                        }
                }
                
        }
        return res;
    }
                                                                                             
}