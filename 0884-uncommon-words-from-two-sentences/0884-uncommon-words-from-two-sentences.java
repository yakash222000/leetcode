class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
            ArrayList<String> res = new ArrayList<>();
            HashMap<String,Integer> map = new HashMap<>();
        for(String str1:s1.split(" ")){
                if(map.containsKey(str1)){
                              map.put(str1,-1);
                }
                else{
                        map.put(str1,2);
                }
        }
        for(String str2:s2.split(" ")){
                if(map.containsKey(str2)){
                              map.put(str2,-1);
                }
                else{
                        map.put(str2,1);
                }
                
        }
        for(String str3:map.keySet()){
               if(map.get(str3)==1||map.get(str3)==2){
                       res.add(str3);
               }
        }
            String []dsf = new String[res.size()];
res.toArray(dsf);
            return dsf;
    }
}