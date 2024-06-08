class Solution {
    public int beautySum(String s) {
        int totalBeauty = 0;
        int n = s.length();
        char[] b=s.toCharArray();
        for (int i = 0; i < n; i++) {
            int[] freq = new int[26]; 
            for (int j = i; j < n; j++) {
                freq[b[j] - 'a']++; 
                int maxFreq = 0;
                int minFreq = Integer.MAX_VALUE;
                for (int f : freq) {
                    if (f > 0) {
                        maxFreq = Math.max(maxFreq, f);
                        minFreq = Math.min(minFreq, f);
                    }
                }
                totalBeauty += maxFreq - minFreq; // Update total beauty
            }
        }

        return totalBeauty;
    }
}