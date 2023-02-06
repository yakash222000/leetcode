class Solution {
    List<List<Integer>> ans ;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        ans = new ArrayList<>();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<candidates.length;i++){
                help(candidates,i,arr,target,0);
        }
        return ans;
    }
        
    void help(int[] nums,int index,ArrayList<Integer> arr,int target,int currSum){
            if(index>=nums.length) return ;
            if(currSum+nums[index]>target) return ;
            if(currSum+nums[index]==target) {
                    arr.add(nums[index]);
                    ans.add(new ArrayList<>(arr));
                    arr.remove(arr.size()-1);
                    return ;
            }
            currSum+=nums[index];
            arr.add(nums[index]);
            for(int i=index;i<nums.length;i++){
                    help(nums,i,arr,target,currSum);
            }
            arr.remove(arr.size()-1);
            
    }
}