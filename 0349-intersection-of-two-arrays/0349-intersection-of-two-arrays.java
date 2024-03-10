class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int count=0;
        for(int i : nums1){
                if(!(map.containsKey(i)))
                        map.put(i,1);
        }
        for(int i : nums2){
                if(map.containsKey(i)){
                        if(map.get(i)==1){
                                count++;
                                map.put(i,map.get(i)+1);
                        }
                }
        }
        int j=0;
        int[] res = new int[count];
        for(int i : map.keySet()){
                if(map.get(i)==2)
                        res[j++]=i;
        }
        return res;
        
    }
}