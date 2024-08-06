class Solution {
    public int minimumPushes(String word) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch : word.toCharArray()) map.put(ch,map.getOrDefault(ch,0)+1);
        ArrayList<Integer> arr = new ArrayList<>();
        for(char i : map.keySet()){
            arr.add(map.get(i));
        }
        Collections.sort(arr);
        int count=0,inc=1,ans=0;
        for(int i=arr.size()-1;i>=0;i--){
            if(count==8){
                inc++;
                count=0;
            }
            ans+=inc*arr.get(i);
            count++;
        }
        return ans;
    }
}