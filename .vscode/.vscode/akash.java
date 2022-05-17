public class akash{
    public static void main(String[] args) {
       int[] intArray={4,45,3,6,34,12};
	quicksort(intArray,0,intArray.length);
       for (int j:intArray){
           System.out.println(j);
       }
    }
    public static void quicksort(int[] input,int start,int end){
        if(end-start<2){
            return ;
        }
        int pivotIndex=partition(input,start,end);
        quicksort(input,start,pivotIndex);
        quicksort(input,pivotIndex+1,end);
    }
    public static int partition(int[] input,int start,int end) {
        int pivot = input[start];
        int i = start;
        int j = end;
        while (i < j) {
            while(i<j && input[--j] >= pivot) {
                if (i < j) {
                    input[i] = input[j];
                }
            }
            while(i<j && input[++i]<=pivot) {
                if (i < j) {
                    input[j] = input[i];
                }
            }
            }
        input[j]=pivot;
        return j;
    }
}
