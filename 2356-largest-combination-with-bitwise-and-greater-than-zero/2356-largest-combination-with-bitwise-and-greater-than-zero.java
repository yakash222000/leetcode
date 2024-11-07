class Solution {
    public int largestCombination(int[] candidates) {
        int max = 0;
        while(true) {
            boolean check = true;
            int count = 0;
            for(int i = 0; i<candidates.length; ++i) {
                if(candidates[i]>0) {
                    check = false;
                    if((candidates[i]&1)==1){
                        count++;
                    }
                    candidates[i] = candidates[i]>>1;
                }
            }
            if(check) break;
            max = Math.max(count, max);
        }
        return max;
    }
}