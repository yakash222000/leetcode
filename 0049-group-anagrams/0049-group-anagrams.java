class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String , ArrayList<String>> map = new HashMap<>();
        List<List<String>> res = new ArrayList<>();
        for(String str : strs) {
                char[] ch = str.toCharArray();
                Arrays.sort(ch);
                String s =new String(ch);
                //System.out.println(s);
                if(map.containsKey(s)) {
                        ArrayList<String > li =map.get(s);
                        li.add(str);
                        map.put(s,li);
                }
                else {
                        ArrayList<String > li = new ArrayList<>();
                        li.add(str);
                        map.put(s,li);
                }
        }
        for(String s : map.keySet()){
                //System.out.println(s);
                res.add(map.get(s));
        }
            return res;
    }
}