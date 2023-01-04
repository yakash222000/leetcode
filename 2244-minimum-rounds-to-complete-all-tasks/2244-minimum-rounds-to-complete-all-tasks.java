class Solution {
    public int minimumRounds(int[] tasks) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : tasks){
                map.put(i,map.getOrDefault(i,0)+1);
        }
        int ans=0;  
        for(int i : map.keySet()){
                if(map.get(i)==1) return -1;
                ans+=help(map.get(i));
        }
        return ans;
    }
    int help(int n){
            if(n%2==0 && n<5) return n/2;
            if(n%3==0) return n/3;
            else return 1+n/3;       
    }
}