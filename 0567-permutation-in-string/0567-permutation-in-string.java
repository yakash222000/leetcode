class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()) return false;
        int[] map1 = new int[26];
        int[] map2 = new int[26];
        for(char ch : s1.toCharArray()){
                map1[ch-'a']++;
        }
        int n=s1.length();
        for(int i=0,j=0;i<s2.length();i++){
                if(i>=n-1){
                        map2[s2.charAt(i)-'a']++;
                        for(int k=0;k<26;k++){
                                if(map1[k]!=map2[k]) break;
                                if(k==25) return true;
                        }
                        map2[s2.charAt(j++)-'a']--;                       
                }
                else{
                    map2[s2.charAt(i)-'a']++;    
                }
        }
        return false;
        
    }
}