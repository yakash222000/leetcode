class Solution {
    public long dividePlayers(int[] skill) {
        int n = skill.length;
        int k = n/2;
        int sum = Arrays.stream(skill).sum();
        if(sum%k != 0) return -1;
        int temp = sum/k;
        long ans = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : skill) {
            if(map.containsKey(temp-i) && map.get(temp-i)>0) {
                k--;
                ans += (temp-i)*i;
                map.put(temp-i,map.get(temp-i)-1);
                continue;
            }
            map.put(i,map.getOrDefault(i,0)+1);
        }
        return k==0?ans:-1;
    }
}