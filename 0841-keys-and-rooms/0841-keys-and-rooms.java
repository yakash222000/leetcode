class Solution {
        HashSet<Integer> set = new HashSet<>();
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {        
        boolean[] arr = new boolean[rooms.size()];
        set.add(0);
        help(rooms,set,arr,0);
        //System.out.println(set);
        return set.size()==rooms.size();
    }
    void help(List<List<Integer>> rooms,HashSet<Integer> set ,boolean[] arr ,int ind ){
           if(arr[ind] || set.size()==rooms.size()) return;
           arr[ind]=true;
           for(int i=0;i<rooms.get(ind).size();i++){
                   set.add(rooms.get(ind).get(i));
           }
           for(int i=0;i<rooms.get(ind).size();i++){
                   help(rooms,set,arr,(rooms.get(ind).get(i)));
           }       
    }
    
}