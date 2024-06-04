class Solution {
    public int longestPalindrome(String s) {
        int ans=0;
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int check=0;
        for(char ch : map.keySet()){
            if(map.get(ch)%2==0){
                ans+=map.get(ch);
            }
            else{
                check=1;
                ans+=map.get(ch)-1;
            }
        }
        if(check==1) ans++;
        return ans;
        
    }
}