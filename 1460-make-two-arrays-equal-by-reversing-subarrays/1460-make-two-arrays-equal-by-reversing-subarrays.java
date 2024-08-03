class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        if(target.length!= arr.length) return false;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : arr) map.put(i,map.getOrDefault(i,0)+1);
        for(int i : target){
            if(!map.containsKey(i)) return false;
            map.put(i,map.getOrDefault(i,0)-1);
        }
        for(int i : map.keySet()){
            if(map.get(i)!=0) return false;
        }
        return true;
    }
}