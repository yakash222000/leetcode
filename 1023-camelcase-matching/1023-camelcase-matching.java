class Solution {
    public List<Boolean> camelMatch(String[] queries, String pattern) {
        ArrayList<Boolean> ans = new ArrayList<>();
        for(String s : queries) {
                int count=0;
                boolean flag=true;
                for(char c : s.toCharArray()){
                        if(count<pattern.length() && c==pattern.charAt(count)){
                                count++;
                                continue;
                        }
                        if('Z'-c>0){
                                flag=false;
                        }
                }
                if(count==pattern.length())
                        ans.add(flag);
                else    
                        ans.add(false);
        }
            return ans;
    }
}