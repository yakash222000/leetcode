class Solution {
    public int strStr(String haystack, String needle) {
        int n=needle.length();
        int res=-1;
        for(int i=0;i<haystack.length()-n+1;i++){
                if(haystack.substring(i,i+n).equals(needle)){
                        res=i;
                        break;
                }
        }
        return res;
    }
}