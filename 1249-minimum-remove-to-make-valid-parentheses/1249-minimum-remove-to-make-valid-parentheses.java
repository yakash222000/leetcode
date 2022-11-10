class Solution {
    public String minRemoveToMakeValid(String s) {
        StringBuilder res = new StringBuilder();
        Stack<Character> st = new Stack<>();
        int open=0,close=0;
        for(char c : s.toCharArray()){
                if(c==')' && open<=close){
                        continue;
                }
                if(c=='(') open++;
                if(c==')') close++;
                st.push(c);
        }
        int count=open-close;
        while(!st.isEmpty()){
                if(st.peek()=='(' && count>0){
                        count--;
                        st.pop();
                        continue;
                }
                else{
                        res.append(st.pop());
                }
        }
        res.reverse();
        return res.toString();
    }
}