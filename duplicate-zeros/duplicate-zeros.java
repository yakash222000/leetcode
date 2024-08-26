class Solution {
    public void duplicateZeros(int[] arr) {
        int n = arr.length; // n is the length of the array
        int currentIndex = -1, futureIndex = 0;
        while (futureIndex < n) {
            currentIndex++;

            futureIndex += (arr[currentIndex] == 0) ? 2 : 1;
        }
      
        int lastIndex = n - 1;
        if (futureIndex == n + 1) {
            arr[lastIndex--] = 0;
            currentIndex--; 
        }
        while (lastIndex >= 0) {
            arr[lastIndex] = arr[currentIndex]; 
            if (arr[currentIndex] == 0) {
                arr[--lastIndex] = arr[currentIndex]; // Set the previous index to zero as well
            }
          
            currentIndex--;
            lastIndex--;
        }
    }
}