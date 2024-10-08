class Solution {
    public int minSwaps(String s) {
        Stack<Character> st = new Stack<>();
        for(char ch : s.toCharArray()) {
            if(!st.isEmpty() && st.peek()=='[' && ch==']') st.pop();
            else st.push(ch);
        }
        int n = st.size()/2;
        return (n+1)/2;
    }
}