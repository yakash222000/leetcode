class Solution {
    public int coinChange(int[] coins, int amount) {
        if (amount <= 0) {
            return 0;
        }

        Arrays.sort(coins);

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(amount);

        boolean[] visited = new boolean[amount + 1];
        visited[amount] = true;

        int step = 1;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Integer cur = queue.poll();
                for (int x : coins) {
                    int target = cur - x;
                    if (target == 0) {
                        return step;
                    }
                    if (target < 0) {
                        break;
                    }
                    if (!visited[target]) {
                        visited[target] = true;
                        queue.offer(target);
                    }
                }
            }

            step++;
        }

        return -1;   
    }
}