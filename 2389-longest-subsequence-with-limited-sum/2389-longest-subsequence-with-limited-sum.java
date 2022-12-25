class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
            int m = queries.length;
            int[] res = new int[m];
            Arrays.sort(nums);
            int count=0,max=0,sum=0;
            for(int i=0;i<m;i++){
                    sum=0;
                    count=0;
                    max=0;
                    for(int j=0;j<nums.length;j++){
                            sum+=nums[j];
                            if(sum<=queries[i]){
                                    max++;
                            }
                            else{
                                    break;
                            }
                    }
                    res[i]=max;
                    
            }
            return res;
    }
}