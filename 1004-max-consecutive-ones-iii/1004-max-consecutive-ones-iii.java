class Solution {
    public int longestOnes(int[] nums, int k) {
        Queue<Integer> q = new LinkedList<>();
        int max=0;
        if(k==0){
                int count=0;
                for(int i:nums){
                        if(i==1){
                                count++;
                        }
                        else count=0;
                        max=Math.max(max,count);
                }
                return max;
        }
        
        for(int i=0,j=0;i<nums.length;i++){
               if(nums[i]==0){
                      if(q.size()==k){
                             j=q.remove()+1;      
                      }
                       q.add(i);
                      
               } 
               max=Math.max(max,i-j+1);
        }
            return max;
    }
}