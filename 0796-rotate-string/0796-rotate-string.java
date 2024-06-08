class Solution {
    public boolean rotateString(String s, String t) {
        if(s.length()!=t.length()) return false;
        if(s.equals(t)) return true;
        for(int i=1;i<s.length();i++){
            String temp=t.substring(i,t.length());
            temp+=t.substring(0,i);
            if(s.equals(temp)) return true;
        }
        return false;
    }
}