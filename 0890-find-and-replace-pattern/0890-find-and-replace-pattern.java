class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        ArrayList<String> res = new ArrayList<>();
        int n=pattern.length();
        HashMap<Character , Character> map = new HashMap<>();
        HashMap<Character , Character> map1 = new HashMap<>();
        for(String str: words) {
                int j=0;
                map.clear();
                map1.clear();
                for(j=0;j<n;j++) {
                  if(!map.containsKey(str.charAt(j))){
                          if(map1.containsKey(pattern.charAt(j))) break;
                          map.put(str.charAt(j),pattern.charAt(j));
                          map1.put(pattern.charAt(j),str.charAt(j));
                  }
                  else{
                          if(!map1.containsKey(pattern.charAt(j)) || 
                            map1.get(pattern.charAt(j))!=str.charAt(j)) break;
                  }
        
                }
                if(j==n) res.add(str);
        }
            return res;
    }
        
}