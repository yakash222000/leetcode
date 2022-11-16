class Solution {
    public int longestBeautifulSubstring(String word) {
        HashSet<Character> set = new HashSet<>();
        int ans=0,i=0,j=0;
        for(i=0,j=0;i<word.length();i++){
               set.add(word.charAt(i));
               if(i!=word.length()-1 && word.charAt(i)>word.charAt(i+1)){
                       if(set.contains('a') && set.contains('e') && set.contains('i') &&
                 set.contains('o') && set.contains('u') ){
                       ans=Math.max(ans,i-j+1);
               }
                       set.clear();
                       j=i+1;
                       continue;
               }   
               if(set.contains('a') && set.contains('e') && set.contains('i') &&
                 set.contains('o') && set.contains('u') ){
                       ans=Math.max(ans,i-j+1);
               }     
        }
            return ans;
    }
}