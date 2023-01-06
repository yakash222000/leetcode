class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int max = 0;
        for (int cost : costs) {
            max = Math.max(max, cost);
        }
        
        int[] freq = new int[max + 1];
        
        for (int cost : costs) {
           freq[cost]++;
        }
        
        int count = 0;
        for (int i = 0; i <= max; i++) {
            if (freq[i] == 0) {
                continue;
            }
            
            if(i > coins) {
                break;
            } else {
                for (int j = 0; j < freq[i]; j++) {
                    if (i > coins) {
                        break;
                    } else {
                        count++;
                        coins = coins - i;
                    }
                }
            }
        }
        
        return count;
        
    }
}