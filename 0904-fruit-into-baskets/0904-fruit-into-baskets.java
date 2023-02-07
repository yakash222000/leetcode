class Solution {
    public int totalFruit(int[] fruits) {
        HashSet<Integer> set = new HashSet<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        int res=0;
        int i=0,j=0;
        while(i<fruits.length && j<fruits.length ){
                if(!set.contains(fruits[i]) && set.size()==2){
                        List<Integer> list = new ArrayList<>(set);
                        //System.out.println(list);
                        while(true){
                                if(map.get(list.get(0))==0 || map.get(list.get(1))==0) break;
                                map.put(fruits[j],map.get(fruits[j])-1);
                                j++;
                                
                        }
                        
                        if(map.get(list.get(0))==0){
                                set.remove(list.get(0));
                        }
                        else{
                              set.remove(list.get(1));  
                        }
                }
                set.add(fruits[i]);
                //System.out.println(i +"  "+(i-j));
                map.put(fruits[i],map.getOrDefault(fruits[i],0)+1);
                //res = Math.max(res,i-j);
                i++;
                res = Math.max(res,i-j);
        }
        return res;
    }
}