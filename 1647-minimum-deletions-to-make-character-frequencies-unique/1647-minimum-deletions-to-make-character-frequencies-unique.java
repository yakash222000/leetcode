class Solution {
    public int minDeletions(String str) {
       HashMap<Character,Integer> map = new HashMap<>();
       for(char c : str.toCharArray()) {
               map.put(c,map.getOrDefault(c,0)+1);
       }
        HashSet<Integer> set = new HashSet<>();
        int ans=0;
        for(char ch : map.keySet()) {
                int count=map.get(ch);
                if(set.contains(count)){
                                 while(set.contains(count)){
                                         ans++;
                                         count--;
                                         if(count==0) break;
                                 }
                         }
                set.add(count);
        }
            return ans;
    }
}