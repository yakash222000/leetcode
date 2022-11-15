class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n=temperatures.length;
        Stack<Integer> st = new Stack<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] ans = new int[n];
        for(int i=n-1;i>=0;i--){
                while(!st.isEmpty() && temperatures[i]>=st.peek()){
                        st.pop();
                }
                if(st.isEmpty()) ans[i]=0;
                else ans[i]=map.get(st.peek())-i;
                st.push(temperatures[i]);
                map.put(temperatures[i],i);
        }
        return ans;
    }
    
}