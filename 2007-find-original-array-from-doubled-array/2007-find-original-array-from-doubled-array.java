class Solution {
    public int[] findOriginalArray(int[] changed) {
         if(changed.length%2==1)
            return new int[0];
        
        int n = changed.length/2;
        int[] result = new int[n];
        Arrays.sort(changed); 
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int c : changed){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        
        int index = 0;
        for(int i : changed){
            int doubled = i*2;
            if(i==0 && map.getOrDefault(i,0)>1){
                result[index++] = i;
                map.put(i,map.get(doubled)-2);
            }
            else if(i!=0 && map.get(i)>0 && map.getOrDefault(doubled,0)>0){
                result[index++] = i;
                map.put(doubled,map.get(doubled)-1);
                map.put(i,map.get(i)-1);
            }
        }
        
        if(index==n)
            return result;
        
        return new int[0];
        
                
    }
}