class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ans = new ArrayList<String>();
        if(nums.length==0) return ans;
        int start=nums[0];
        for(int i=0;i<nums.length;i++){
            if(i<nums.length-1){
                if(nums[i]<nums[i+1]-1){
                    if(start==nums[i]){
                        ans.add(Integer.toString(nums[i]));
                        start=nums[i+1];
                    }
                    else{
                        ans.add(Integer.toString(start)+"->"+Integer.toString(nums[i]));
                        start=nums[i+1];
                    }
                }
                // else{
                //     start=nums[i];
                // }
            }
            else{
                if(start==nums[i]){
                        ans.add(Integer.toString(nums[i]));
                }
                else{
                        ans.add(Integer.toString(start)+"->"+Integer.toString(nums[i]));
                }     
            }
        }
        return ans;
    }
}