class Solution {
    public List<Integer> numOfBurgers(int tomatoSlices, int cheeseSlices) {
        List<Integer> ans = new ArrayList<>();
        if(tomatoSlices<cheeseSlices*2) return ans;
        int first =0;
            while(cheeseSlices>0 && tomatoSlices>cheeseSlices*2){
                    tomatoSlices=tomatoSlices-4;
                    cheeseSlices--;
                    first++;
            }
            if(tomatoSlices==cheeseSlices*2){
                    ans.add(first);
                    ans.add(cheeseSlices);
                    return ans;
            }
            return ans;
            
    }
}