package binarysearch;

import java.util.Arrays;

class Solution {
    // Function to calculate total hours for given speed
    public static int calculateTotalHours(int[] arr, int hourly) {
        int totalHours = 0;
        for (int pile : arr) {
            // Add hours using ceil
            totalHours += (int)Math.ceil((double)pile / hourly);
        }
        return totalHours;
    }

    // Function to find minimum eating speed
    public static int bruteForce(int[] arr, int h) {
        // Find maximum pile size............
        int maxVal = Arrays.stream(arr).max().getAsInt();

        // Try every possible speed
        for (int i = 1; i <= maxVal; i++) {
            int hours = calculateTotalHours(arr, i);

            // If hours fit within h
            if (hours <= h) {
                return i;
            }
        }
        return maxVal;
    }
    public static int optimalSolution(int arr[],int h){
      int low=1;
      int high=arr[arr.length-1];
      while(low<=high){
        int mid=low+(high-low)/2;
        int hours = calculateTotalHours(arr, mid);
            // If hours fit within h
            if(hours <= h){
                high=mid-1;
            }else{
                low=mid+1;
            }
      }
              return low;

}
}


public class KokoEatingBanana {
    public static void main(String[] args) {
        // Input array
        int[] arr = {3, 6, 7, 11};
        // Hours allowed
        int h =8;
       
        
        System.out.println(Solution.optimalSolution(arr, h));
    }
    
}