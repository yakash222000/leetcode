class Solution {
    public int maxDivScore(int[] nums, int[] divisors) {
        int max=-1,res=0;
        for(int i : divisors){
            int count=0;
            for(int j : nums){
                if(j%i==0) count++;
            }
            if(count==max){
                res=Math.min(res,i);   
            }
            if(count>max){
                max=count;
                res=i;   
            }
        }
        return res;
    }
}