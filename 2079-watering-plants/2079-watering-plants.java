class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int x=capacity;
            int steps=0;
            for(int i=0;i<plants.length;i++){
                    if(plants[i]>x){
                            x=capacity;
                            steps=steps+i*2+1;
                            x-=plants[i];
                    }
                    else{
                            steps++;
                            x-=plants[i];
                    }
                    
            }
            return steps;
    }
}