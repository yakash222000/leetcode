class Solution {
    public int subarraySum(int[] nums, int k) {
        int ans=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] preSum = new int[nums.length];
        preSum[0]=nums[0];
        map.put(0,1);
        for(int i=1;i<nums.length;i++){
              preSum[i]=preSum[i-1]+nums[i];     
        }
        for(int i=0;i<nums.length;i++){
                if(map.containsKey(preSum[i]-k)) ans+=map.get(preSum[i]-k);
                map.put(preSum[i],map.getOrDefault(preSum[i],0)+1);
        }
            return ans;
        
        
        
    }
}