class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++) {
                if(i!=0 && nums[i]==nums[i-1])continue;
                int a=nums[i];
                int b=i+1;
                int c=nums.length-1;
                while(b<c){
                        int sum=a+nums[b]+nums[c];
                        if(sum>0){
                                c--;
                        }
                        else {
                                if(sum<0){
                                    b++;
                                }
                                else{
                                    ArrayList<Integer> res1 = new ArrayList<>();
                                    res1.add(a);
                                    res1.add(nums[b]);
                                    res1.add(nums[c]);
                                     ans.add(res1);
                                    while(b<c && nums[b]==nums[b+1] ){
                                         b++;
                                    }
                                    while(b<c && nums[c]==nums[c-1]){
                                            c--;
                                    }
                                        c--;
                                        b++;
                        
                        
                               }
                        }
               }
        }
            return ans;
    }
}