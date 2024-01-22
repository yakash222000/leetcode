class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] res = new int[2];
        int[] freq = new int[nums.length];
        Arrays.fill(freq,0);
        for(int i : nums) {
                freq[i-1]++;
        }
        for(int i=0;i<nums.length;i++){
                if(freq[i]>1) res[0]=i+1;
                if(freq[i]<1) res[1]=i+1;
        }
            return res;
            
        
    }
}