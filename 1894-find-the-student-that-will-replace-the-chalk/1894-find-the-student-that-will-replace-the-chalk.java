class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        long sum = 0;
        for(int i : chalk) sum += i;
        long count = k%sum;
        for(int i=0 ; i<chalk.length ; ++i) {
            if(chalk[i]>count) return i;
            count -= chalk[i];
        }
        return 0;
    }
}