class Solution {
    public String reverseParentheses(String s) {
        StringBuilder res = new StringBuilder();
        Stack<Character> st = new Stack<>();
        for(char c : s.toCharArray()){
                if(c==')') {
                      String str="";
                      while(st.peek()!='(') {
                            str+=st.pop(); 
                      }
                        st.pop();
                        for(char ch : str.toCharArray()){
                                st.push(ch);
                        }
                }
                else{
                        st.push(c);
                }
        }
            //System.out.print(st);
            while(!st.isEmpty()){
                    res.append(st.pop());
            }
            res.reverse();
            return res.toString();
    }
}