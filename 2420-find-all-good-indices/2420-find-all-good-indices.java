class Solution {
    public List<Integer> goodIndices(int[] nums, int k) {
        int n=nums.length;
        List<Integer> ans = new ArrayList<>();
        int[] right=new int[n];
        int[] left = new int[n];
        if(nums[n-1]<nums[n-2])right[n-1]=0;
        else right[n-1]=1;
        if(nums[0]<nums[1])left[0]=0;
            else left[0]=1;
        
            //left subarray count
            
            for(int i=1;i<n;i++){
              if(left[i-1]==0)left[i-1]=1;
              if(nums[i]>nums[i-1])left[i]=0;
              else left[i]=left[i-1]+1;
        }
           //right subarray count
        
            for(int i=n-2;i>=0;i--){
              if(right[i+1]==0)right[i+1]=1;
              if(nums[i]>nums[i+1])right[i]=0;
              else right[i]=right[i+1]+1;
              
        }
            //checking right and left subarray and adding in list
        
            for(int i=k;i<n-k;i++){
                if(left[i-1]>=k && right[i+1]>=k) 
                        ans.add(i);
                       
        }
        return ans;   
    }
}