class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> result = new ArrayList<>();
        int current = 1; // The current number to be pushed.

        for (int i = 0; i < target.length; i++) {
            while (current < target[i]) {
                result.add("Push");
                result.add("Pop"); // After pushing, immediately pop.
                current++;
            }
            result.add("Push");

            current++; // Move to the next number to be pushed.
        }

        return result;
    }
}