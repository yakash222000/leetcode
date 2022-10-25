class Solution {
    public String longestWord(String[] words) {
        HashSet<String> set = new HashSet<>();
        set.add("");
        for(int i=0;i<words.length;i++){
                        set.add(words[i]);
        }
        String res="";
        int max=0;
        for(int i=0;i<words.length;i++){
                if(check(set,words[i]) && words[i].length()>=max){
                        if(max==words[i].length()){
                                if(res.compareTo(words[i])>0)res=words[i];
                        }
                        else{
                                max=words[i].length();
                                res=words[i];
                        }
                }
        }
            return res;
        
    }
        boolean check(HashSet<String> set , String str) {
                if(str=="") return true;
                else{
                        if(!set.contains(str)) return false;
                        return check(set,str.substring(0,str.length()-1));
                }
        }
}