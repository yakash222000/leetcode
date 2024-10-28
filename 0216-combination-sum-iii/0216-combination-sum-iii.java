class Solution {

    public List<List<Integer>> combinationSum3(int k, int n) {
        List<Integer> temp=new ArrayList<>();
        List<List<Integer>> result=new ArrayList<>();
        int[] arr= {1,2,3,4,5,6,7,8,9};
        solve(0,k,n,arr,0,0,temp,result);
        return result;
    }

    void solve(int length,int k,int sum,int[]arr,int i,int currsum,List<Integer> temp,List<List<Integer>> result){
        if(length==k && currsum==sum) {
            result.add(new ArrayList<>(temp));
            return;
        }
        if (i >= arr.length || length > k || currsum > sum) return;

        temp.add(arr[i]);
        solve(length+1,k,sum,arr,i+1,currsum+arr[i],temp,result);
        temp.remove(temp.size()-1);
        solve(length,k,sum,arr,i+1,currsum,temp,result);
    }
}