class Solution {
    public List<String> commonChars(String[] words) {
        List<String> ans = new ArrayList<>();
        int[][] hash = new int[words.length][26];
        for(int i=0;i<words.length;i++){
            String s = words[i];
            for(char ch : s.toCharArray()){
                hash[i][ch-'a']++;
            }
        }
        for(int i=0;i<26;i++){
            int min=hash[0][i];
            for(int j=1;j<words.length;j++){
                min=Math.min(min,hash[j][i]);
            }
            for(int k=0;k<min;k++){
                ans.add(Character.toString((char)(i+97)));
            }
        }
        return ans;
        
    }
}