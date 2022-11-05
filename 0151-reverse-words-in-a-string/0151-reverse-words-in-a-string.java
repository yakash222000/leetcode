class Solution {
    public String reverseWords(String s) {
        StringBuilder res = new StringBuilder();
        Stack<Character> st = new Stack<>();
        for(int i=s.length()-1;i>=0;i--) {
            char c=s.charAt(i);
            if(c==' ') {
                if(!st.isEmpty()){
                    if(res.length()!=0) res.append(" ");
                    while(!st.isEmpty()){
                        res.append(st.pop());
                    }
                }
            }
            else{
                st.push(c);
            }
        }
        if(!st.isEmpty()) {
            if(res.length()!=0) res.append(" ");
            while(!st.isEmpty()){
                res.append(st.pop());
            }
        }
    
        return res.toString();
    }
}