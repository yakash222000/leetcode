class Solution {
    private int MOD =1000000007;
    private Map<String,Long> map = new HashMap<>();
        
    public int countVowelPermutation(int n) {
        char[] ch = new char[]{'a','e','i','o','u'};
        long total=0;
        for(char c : ch){
                total=(total + fun(n-1,c))%MOD;
        }
        return (int)total;
    }
    public long fun(int remChar,char pc){
            if(remChar==0) return 1;
            String key =""+ remChar + pc;
            if(map.containsKey(key)) return map.get(key);
            long total=0;
            switch(pc){
                    case 'a' : total = (fun(remChar-1,'e'))%MOD;
                          break;
                    case 'e' : total = (fun(remChar-1,'a')+fun(remChar-1,'i'))%MOD;
                          break;
                    case 'i' : total = (fun(remChar-1,'a')+fun(remChar-1,'e')+fun(remChar-1,'o')+fun(remChar-1,'u'))%MOD;
                          break;
                    case 'o' : total=(fun(remChar-1,'i')+fun(remChar-1,'u'))%MOD;
                          break;
                    case 'u' : total = (fun(remChar-1,'a'))%MOD;
                          break;
            }
            map.put(key,total);
            return total;
    }
}