class Solution {
    public String makeGood(String s) {
        StringBuilder res = new StringBuilder();
        Stack<Character> st = new Stack<>();
        for(char c : s.toCharArray()){
                if(!st.isEmpty() && Math.abs(c-st.peek())==32){
                        st.pop();
                }
                else{
                        st.push(c);
                }
        }
        while(!st.isEmpty()) {
                res.append(st.pop());
        }
        res.reverse();
        return res.toString();
    }
}