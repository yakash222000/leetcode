class Solution {
    
    public int minCost(String colors, int[] neededTime) {
        int n=neededTime.length,res=0;
        Stack<Pair<Character,Integer>> st = new Stack<>();
        Pair<Character ,Integer> p = new Pair<>(colors.charAt(0),neededTime[0]);
        st.push(p);
        for(int i=1;i<n;i++){
                p = new Pair<>(colors.charAt(i),neededTime[i]);
                if(st.peek().getKey()==p.getKey()){
                        if(st.peek().getValue() > p.getValue()){
                                res+=p.getValue();
                        }
                        else{
                                res+=st.peek().getValue();
                                st.pop();
                                st.push(p);
                        }
                }
                else{
                        st.push(p);
                }
                
        }
        return res;
    }
}