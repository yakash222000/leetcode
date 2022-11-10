class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        int n=deck.length;
        int[] ans = new int[n];
        Queue<Integer> q = new LinkedList<>();
        q.add(deck[--n]);      
        while(q.size()!=deck.length){
                int temp=q.remove();
                q.add(temp);
                q.add(deck[--n]);
        }
        while(q.size()!=0){
                ans[q.size()-1]=q.remove();
        }
        //System.out.print(q);
            return ans;
    }
}