package binarysearch;
public class FindRotationCount {
      public static int findTimes(int[] arr) {
       // Initialize low and high pointers
        int low = 0, high = arr.length - 1;
    if(arr[low]<arr[high]) return 0;
        while (low < high) {
     
            int mid = low + (high - low) / 2;
       
            if (arr[mid] > arr[high]) {
        
                low = mid + 1;
               
            } else {
                
                high = mid;
            }
        }

        return low;
    }
 public static void main(String[] args) {
    int arr[]={};
    System.out.println(findTimes(arr));
 }   
}