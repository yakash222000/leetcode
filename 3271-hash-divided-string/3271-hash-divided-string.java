class Solution {
    public String stringHash(String s, int k) {
        StringBuilder ans = new StringBuilder();
        int n = s.length();
        int div = n/k;
        for(int i=0;i<div;i++){
            int sum = 0;
            for(int j=0;j<k;j++){
                int pos = i*k+j;
                sum+=(s.charAt(pos)-'a');
            }
            ans.append((char)(sum%26+97));
        }
        return ans.toString();
    }
}