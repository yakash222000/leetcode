
class Solution {
    private long gcd(long a, long b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
    
    private long lcm(long a, long b) {
        return (a * b) / gcd(a, b);
    }
    
    private long arrayGcd(int[] nums, int skip) {
        long result = nums[0];
        boolean firstFound = false;
        
        for (int i = 0; i < nums.length; i++) {
            if (i == skip) continue;
            if (!firstFound) {
                result = nums[i];
                firstFound = true;
                continue;
            }
            result = gcd(result, nums[i]);
        }
        return result;
    }
    
    private long arrayLcm(int[] nums, int skip) {
        long result = nums[0];
        boolean firstFound = false;
        
        for (int i = 0; i < nums.length; i++) {
            if (i == skip) continue;
            if (!firstFound) {
                result = nums[i];
                firstFound = true;
                continue;
            }
            result = lcm(result, nums[i]);
        }
        return result;
    }
    
    public long maxScore(int[] nums) {
        int n = nums.length;
        
        if (n == 0) return 0;
        if (n == 1) return (long)nums[0] * nums[0];
        
        long maxScore = 0;
        
        long fullGcd = arrayGcd(nums, -1);
        long fullLcm = arrayLcm(nums, -1);
        maxScore = fullGcd * fullLcm;
        
        for (int i = 0; i < n; i++) {
            if (n - 1 == 0) continue; 
            
            long currGcd = arrayGcd(nums, i);
            long currLcm = arrayLcm(nums, i);
            long score = currGcd * currLcm;
            
            maxScore = Math.max(maxScore, score);
        }
        
        return maxScore;
    }
}