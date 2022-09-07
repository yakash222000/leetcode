class Solution {
    public int minimumRefill(int[] plants, int capacityA, int capacityB) {
        int p1=0,p2=plants.length-1,ac=capacityA,bc=capacityB;
            int res=0;
            while(p1<p2){
                    if(ac<plants[p1]){
                            res++;
                            ac=capacityA;
                    }
                    if(bc<plants[p2]){
                            res++;
                            bc=capacityB;
                    }
                    ac-=plants[p1];
                    bc-=plants[p2];
                    p1++;
                    p2--;
            }
            
            if(p1==p2){
                    if(ac<plants[p1] && bc < plants[p1]){
                            res++;
                    }
            }
            
            return res;
    }
}