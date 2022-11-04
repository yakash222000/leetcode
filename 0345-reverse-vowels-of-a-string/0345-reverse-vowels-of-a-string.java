class Solution {
    public String reverseVowels(String s) {
        char[] ch ={'a','e','i','o','u','A','E','I','O','U'};
        HashSet<Character> set = new HashSet<>();
        for(char c : ch) {
                set.add(c);
        }
        Stack<Character> st = new Stack<>();
        for(char c : s.toCharArray()){
                if(set.contains(c)){
                        st.push(c);
                }
        }
        StringBuilder res = new StringBuilder();
        for(char c : s.toCharArray()){
                if(set.contains(c)){
                        res.append(st.pop());
                }
                else{
                        res.append(c);
                }
        }
            return res.toString();
    }
}