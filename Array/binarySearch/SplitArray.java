package array.binarySearch;
public class SplitArray {
    public static int findMax(int arr[]){
        int max=Integer.MIN_VALUE;
        for(int i : arr){
            max=Math.max(i, max);
        }
        return max;
    }
     public static int findSum(int arr[]){
        int sum=0;
        for(int i : arr){
            sum+=i;
        }
        return sum;
    }
     public static int countPartitions(int[] arr, int maxSum) {
        int partitions = 1; // at least one partition
        long subarraySum = 0; // sum of current subarray
        for (int num : arr) {
            if (subarraySum + num <= maxSum) {
                subarraySum += num;
            } else {
                partitions++;
                subarraySum = num;
            }
        }
        return partitions;
    }
      public  static int bruteForce(int[] arr, int k) {
        int low = findMax(arr); // max element
        int high = findSum(arr); // sum of all elements

        // Brute-force from low to high
        for (int maxSum = low; maxSum <= high; maxSum++) {
            if (countPartitions(arr, maxSum) == k) {
                return maxSum;
            }
        }
        return low; 
    }
    public static  int optimalSolution(int[] arr, int k) {
        int low = findMax(arr); // largest element
        int high =findSum(arr); // sum of all elements
        while (low <= high) {
            int mid = (low + high) / 2;
            int partitions = countPartitions(arr, mid);

            if (partitions > k) {
                low = mid + 1; // too many partitions → increase maxSum
            } else {
                high = mid - 1; // valid but try smaller maxSum
            }
        }
        return low;
    }
   

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        int k = 2;
        int ans = optimalSolution(arr, k);
        System.out.println("The answer is: " + ans);
    }
}
