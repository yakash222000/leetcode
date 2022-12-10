class Solution {
    public int minAddToMakeValid(String s) {
        int res=0;
        Stack<Character> st = new Stack<>();
        for(char c : s.toCharArray()){
                if(st.isEmpty()){
                        if(c==')'){
                                res++;
                        }
                        else{
                                st.push(c);
                        }
                }
                else{
                        if(c==')'){
                                if(st.peek()=='('){
                                        st.pop();
                                }
                                else{
                                        res++;
                                }
                        }
                        else {
                                st.push(c);
                        }
                }
        }
        while(!st.isEmpty()){
                res++;
                st.pop();
        }
            return res;
    }
}