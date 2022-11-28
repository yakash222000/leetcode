class Solution {
    public int[] numSmallerByFrequency(String[] queries, String[] words) {
        int[] ans = new int[queries.length];
        int[] dp = new int[words.length];
        for(int i=0;i<words.length;i++){
                dp[i]=check(words[i]);
        }
        for(int i=0;i<queries.length;i++){
                int count=0,num=check(queries[i]);
                for(int j=0;j<words.length;j++) {
                        if(num<dp[j]) count++;
                }
                ans[i]=count;
        }
            return ans;
    }
    int check(String s) {
            HashMap<Character,Integer> map = new HashMap<>();
            char min ='z';
            for(char ch : s.toCharArray()){
                    map.put(ch,map.getOrDefault(ch,0)+1);
                    if(min>ch){
                            min=ch;     
                    }
            }
            return map.get(min);
    }
}