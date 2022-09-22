class Solution {
    public String reverseWords(String s) {
            String[] arr = s.split(" ");
            for(int i=0;i<arr.length;i++){
                    StringBuilder str
            = new StringBuilder(arr[i]);
                    StringBuilder str1=str.reverse();
                    arr[i]=str1.toString();
                    //System.out.println(arr[i]);
            }
            String result = String.join(" ",arr);
            return result;
    }
}