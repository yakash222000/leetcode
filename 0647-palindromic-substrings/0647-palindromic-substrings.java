class Solution {
    public int countSubstrings(String s) {
        //if(s.length()==1) return 1;
        int ans=1;
        for(int i=1;i<s.length();i++) {
                int index1=i,index2=i;
                while(index1>=0 && index2<s.length()){
                     if(s.charAt(index1)!=s.charAt(index2)) break;
                     ans++;
                     index1--;
                     index2++;
                }
                index1=i-1;
                index2=i;
                while(index1>=0 && index2<s.length()){
                        if(s.charAt(index1)!=s.charAt(index2)) break;
                     ans++;
                     index1--;
                     index2++;
                }
        }
        return ans;
    }
}