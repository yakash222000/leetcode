class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c : s.toCharArray()) {
                map.put(c,map.getOrDefault(c,0)+1);
        }
        Map<Character, Integer> map1 = sortByValue(map);
        StringBuilder res = new StringBuilder();
        for(char c : map1.keySet()){
                for(int i=0;i<map1.get(c);i++){
                        res.append(c);
                }
        }
        return res.toString();
        
    }
        public static HashMap<Character,Integer> sortByValue(HashMap<Character,Integer> hm){
        List<Map.Entry<Character, Integer> > list =
               new LinkedList<Map.Entry<Character, Integer> >(hm.entrySet());
 
        Collections.sort(list, new Comparator<Map.Entry<Character, Integer> >() {
            public int compare(Map.Entry<Character, Integer> o1,
                               Map.Entry<Character, Integer> o2)
            {
                return (o2.getValue()).compareTo(o1.getValue());
            }
        });
        HashMap<Character, Integer> temp = new LinkedHashMap<Character, Integer>();
        for (Map.Entry<Character, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
    }
}