class Solution {
    List<List<Integer>> ans;
    public List<List<Integer>> subsets(int[] nums) {
        ans = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        help(nums,0,temp);
        return ans;
    }
    
    public void help(int[] nums,int index,ArrayList<Integer> temp){
        if(index==nums.length) {
            ans.add(new ArrayList<>(temp));
            return;
        }
        help(nums,index+1,temp);
        temp.add(nums[index]);
        help(nums,index+1,temp);
        temp.remove(temp.size()-1);
        
    }
}