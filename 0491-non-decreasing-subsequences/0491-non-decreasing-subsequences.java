class Solution {
    HashSet<List<Integer>> ans = new HashSet<>();
    public List<List<Integer>> findSubsequences(int[] nums) {
            ArrayList<Integer> res = new ArrayList<>();
            help(nums,0,res);
            return new ArrayList<>(ans);
    }
    void help(int[] nums ,int index ,ArrayList<Integer> res){
            if(res.size()>=2) ans.add(new ArrayList(res)); 
            
            for(int i=index;i<nums.length;i++){
                    if(res.size()==0 || nums[i]>=res.get(res.size()-1)){
                            res.add(nums[i]);
                            help(nums,i+1,res);
                            res.remove(res.size()-1);
                    }         
            }
    }
}