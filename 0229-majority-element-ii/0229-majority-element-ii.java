class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> res = new ArrayList<>();
        HashMap<Integer,Integer> map= new HashMap<>();
        int freq=nums.length/3;
        for(int i : nums){
                if(map.containsKey(i)){
                        map.put(i,map.get(i)+1);
                }
                else
                        map.put(i,1);
        }
       // System.out.println(map);
        for( int i : map.keySet()){
                if(map.get(i)>freq){
                        res.add(i);
                       
                }
                        
        }
        return res;
    }
}