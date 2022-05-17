import java.util.*;
public class bubbleSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter number of elements :");
        int n=in.nextInt();
        int[] arr =new int[n];
        System.out.println("enter elements:");
        for (int i=0; i<n;i++){
            arr[i]=in.nextInt();
        }
        BubbleSort(arr);// 
        System.out.println("sorted array:");
        for(int j: arr){
            System.out.print(j+" ");
        }
////////////////////////////////////////////////////////////////////////
    }
    public static int[] BubbleSort(int[] array){
        for(int i=0;i<array.length-1;i++){
            for(int j=0;j<array.length-i-1;j++){
                if(array[j]>array[j+1]){
                    swap(array[j],array[j+1]);
                    //  int temp=array[j];
                    //  array[j]=array[j+1];
                    //  array[j+1]=temp;
                }
            }

        }
        return array;
    }
//////////////////////////////////////////////////////////////////////
    static void swap(int a, int b){
        int temp=a;
        a=b;
        b=temp;
    }
}
