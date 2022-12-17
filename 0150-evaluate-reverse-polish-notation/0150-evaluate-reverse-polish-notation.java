class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for(String s : tokens) {
                if(s.equals("*") || s.equals("/") || s.equals("+") || s.equals("-")) {
                        int a=st.pop();
                        int b=st.pop();
                        int c=0;
                        if(s.equals("*")){
                                c=a*b;
                        }
                        if(s.equals("-")){
                                c=b-a;
                        }
                        if(s.equals("+")){
                                c=a+b;
                        }
                        if(s.equals("/")){
                                c=b/a;
                        }
                        st.push(c);
                }
                else{
                        int a=Integer.parseInt(s);
                        st.push(a);
                }
        }
            return st.pop();
    }
}