class Solution {
    public int minDeletionSize(String[] strs) {
            int ans=0;
        for(int i=0;i<strs[0].length();i++){
                char temp='a';
                for(String str : strs){
                      if(str.charAt(i)<temp) {
                              ans++;
                              break;
                      }
                      else{
                              temp=str.charAt(i);
                      }
                }
        }
        return ans;
    }
}