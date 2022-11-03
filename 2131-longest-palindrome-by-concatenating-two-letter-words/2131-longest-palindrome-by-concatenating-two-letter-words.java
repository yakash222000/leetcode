class Solution {
    public int longestPalindrome(String[] words) {
        int res=0,count=0;
        HashMap<String,Integer> map = new HashMap<>();
        HashSet<String> set1 = new HashSet<>();
        for(String s : words){
                if(s.charAt(0)==s.charAt(1)) {
                        if(set1.contains(s)){
                             res+=4;
                             set1.remove(s);
                             count--;
                        }
                        else{
                                set1.add(s);
                                count++;
                        }
                        continue;
                }
                if(map.containsKey(Character.toString(s.charAt(1))+
                                Character.toString(s.charAt(0))) && 
                                map.get(Character.toString(s.charAt(1))+
                                Character.toString(s.charAt(0)))>0){
                        
                        res+=4;
                        map.put(Character.toString(s.charAt(1))+
                                   Character.toString(s.charAt(0)),
                               map.get(Character.toString(s.charAt(1))+
                                   Character.toString(s.charAt(0)))-1);
                }
                else{
                        map.put(s,map.getOrDefault(s,0)+1);
                }
        }
            if(count>0) return res+2;
            
            return res;
    }
}