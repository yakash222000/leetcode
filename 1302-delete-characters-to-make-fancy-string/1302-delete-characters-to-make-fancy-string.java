class Solution {
    public String makeFancyString(String s) {
        if(s.length()<3) return s;
        StringBuilder str = new StringBuilder();
        str.append(s.substring(0,2));
        for(int i=2;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1) && s.charAt(i) == s.charAt(i-2)) continue;
            str.append(s.charAt(i));
        }
        return str.toString();
    }

}