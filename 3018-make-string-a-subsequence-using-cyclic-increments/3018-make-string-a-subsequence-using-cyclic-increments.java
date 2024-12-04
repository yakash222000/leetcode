class Solution {
    public boolean canMakeSubsequence(String str1, String str2) {
        int index = 0;
        for(int i = 0; i<str1.length(); i++) {
            int val = str1.charAt(i)-'a';
            int curr = str2.charAt(index) - 'a';
            if(val == curr || (val+1)%26==curr) index++;
            if(index == str2.length()) return true;
        }
        return false;
    }
}