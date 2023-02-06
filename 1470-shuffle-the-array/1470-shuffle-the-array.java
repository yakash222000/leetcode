class Solution {
    public int[] shuffle(int[] nums, int n) {
        int arr[]=new int[2*n];
            int k=0,m=0,j=n;
            for(int i=0;k<2*n;){
                    arr[k++]=nums[m++];
                    arr[k++]=nums[j++];
            }
            return arr;
    }
}