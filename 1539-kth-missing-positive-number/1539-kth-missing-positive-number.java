class Solution {
    public int findKthPositive(int[] arr, int k) {
            int j=0,n=1,i=0;
       while(j<k){
               if(i<arr.length){
                       if(arr[i]==n){
                               i++;
                       }
                       else
                       j++;
               }
               else
                       j++;
               n++;
            }
            return n-1;
           }   
  
}