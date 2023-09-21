class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] res=new int[nums1.length+nums2.length];
            int i=0,j=0,k=0;
            int n1=nums1.length,n2=nums2.length;
        while(i<n1 && j<n2){
                
                if(nums1[i]>nums2[j]){
                        res[k++]=nums2[j];
                        j++;
                }
                else{
                        res[k++]=nums1[i];
                        i++;
                }
        }
            while(i<n1){
                    res[k++]=nums1[i++];
            }while(j<n2){
                    res[k++]=nums2[j++];
            }
            double x;
            if((n1+n2)%2!=0){
                    x=res[(n1+n2)/2];
            }
            else{
                    x=(res[(n1+n2)/2]+res[((n1+n2)/2)-1])/(double)2;
            }
            return x;
    }
}