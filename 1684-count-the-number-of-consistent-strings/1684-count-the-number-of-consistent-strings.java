class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        HashSet<Character> set = new HashSet<>();
        for(char c : allowed.toCharArray()) {
            set.add(c);
        }
        int count = 0;
        for(String s : words) {
            boolean check = true;
            for(char ch : s.toCharArray()) {
                if(!set.contains(ch)) {
                    check = false;
                    break;
                }
            }
            if(check) count++;
        }
        return count;
    }
}