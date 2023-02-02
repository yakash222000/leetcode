class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        int size=0;
        for(String s : words){
                if(size<s.length()){
                        size=s.length();
                }
        }
        HashMap<Character,Integer> map = new HashMap<>();
        int count=0;
        for(char ch : order.toCharArray()){
              map.put(ch,count);
              count++;
        }
        for(int i=1;i<words.length;i++){
                for(int j=0;j<Math.max(words[i].length(),words[i-1].length());j++){
                        int val1=0,val2=0;
                        if(j>=words[i].length()){
                                val1=-1;
                        }
                        else{
                                val1=map.get(words[i].charAt(j));
                        }
                        if(j>=words[i-1].length()){
                                val2=-1;
                        }
                        else{
                                val2=map.get(words[i-1].charAt(j));
                        }
                        if(val2>val1) return false;
                        if(val1>val2) break;
                }
        }
        return true;
            
    }
}