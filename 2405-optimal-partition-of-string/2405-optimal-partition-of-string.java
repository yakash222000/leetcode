class Solution {
    public int partitionString(String s) {
        int i=0,j=0,res=0;
            int[] arr = new int[26];
            while(j<s.length()){
                    if(arr[s.charAt(j)-'a']>0){
                            res++;
                            while(i<j){
                                   arr[s.charAt(i)-'a']--;
                                    i++;
                            }
                    }
                    arr[s.charAt(j)-'a']++;
                    j++;
                    
            }
            return res+1;
    }
}