class Solution {
    public int[] numsSameConsecDiff(int n, int k) {
         Set<Integer> r = new HashSet<>();
        
        for(int i = 1; i <= 9; i++) {
            r.add(i);
        }
        
        while(--n > 0) {
            Set<Integer> temp = new HashSet<>();
            for(int e: r) {
                int right = e % 10 + k;
                int left = e % 10 - k;
                if(right <= 9) {
                    temp.add(e* 10 + right);
                }
                
                if(left >= 0) {
                    temp.add(e* 10 + left);
                }
            }
            
            r = temp;
        }
        
        int[] result = new int[r.size()];
        
        int index = 0;
        for(int e: r) {
            result[index++] = e;
        }
        
        return result;
    }
}