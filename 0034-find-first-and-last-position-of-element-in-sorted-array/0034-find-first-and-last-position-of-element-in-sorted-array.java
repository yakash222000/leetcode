class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res = new int[2];
        res[0]=-1;
        res[1]=-1;
        int l=0,r=nums.length-1;
        while(l<=r){
                int mid=(l+r)/2;
                if(nums[mid]==target){
                        int temp=mid;
                        while(true){
                                temp--;
                               if(temp<0 || nums[temp]!=target) break;
                        }
                        res[0]=temp+1;
                        temp=mid;
                        while(true){
                                temp++;
                               if(temp>nums.length-1 || nums[temp]!=target) break;
                        }
                        res[1]=temp-1;
                        break;
                }
                if(nums[mid]>target){
                        r=mid-1;
                }
                if(nums[mid]<target){
                        l=mid+1;
                }
                
        }
        return res;
    }
}