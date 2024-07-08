class Solution {
    public int findTheWinner(int n, int k) {
        int currentWinner = 0;
        for (int i = 1; i <= n; i++) {
            currentWinner = (currentWinner + k) % i;
        }
        return currentWinner + 1;
    }
}