class Solution {
    public String removeOccurrences(String s, String part) {
        StringBuilder res = new StringBuilder();
        for(int i=0;i<s.length();i++){
                res.append(s.charAt(i));
                if(res.indexOf(part)>=0){
                        res=new StringBuilder(res.substring(0,res.length()-part.length()));
                }
        }
            return res.toString();
        
    }
}