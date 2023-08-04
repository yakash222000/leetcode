class Solution {
   public boolean wordBreak(String s, List<String> wordDict) {  
        Boolean [] dp = new Boolean[s.length()];
        return helper(0, s, wordDict, dp);
   }

   public boolean helper(int index, String s, List<String> wordDict, Boolean [] dp)
   {
       //step 3
       int n = s.length();
       if(index == n) return true;
       if(dp[index] != null) return dp[index];
       for(int k = index + 1; k <= n; k++)
       {
           //step 2
           if(wordDict.contains(s.substring(index, k)) && helper(k, s, wordDict, dp))
           return dp[index] = true;
       }
       return dp[index] = false;
   }
}