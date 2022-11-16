class Solution {
    public List<Integer> numOfBurgers(int tomatoSlices, int cheeseSlices) {
         int total=tomatoSlices-2*cheeseSlices;
        if(total<0||total%2!=0||total/2>cheeseSlices){
            return new ArrayList<>();
        }
        return Arrays.asList(total/2,cheeseSlices-total/2); 
    }
}