package array;

import java.util.Arrays;

public class TripletWithSmallerSum {
    public static int bruteForceApproach(int sum, int[] arr){
        int n = arr.length;
        int ans = 0;
        for (int i = 0; i < n - 2; i++){
        for (int j = i + 1; j < n - 1; j++){
        for (int k = j + 1; k < n; k++){
        if (arr[i] + arr[j] + arr[k] < sum)  ans++;
}
}
}
return ans;
    }
    public static  int countTriplets(int sum, int arr[]) {
        Arrays.sort(arr);
        int n=arr.length;
        int count=0;
       for(int i=0;i<n-2; i++){
           int low=i+1;
           int high=n-1;
           while(low<high){
               int curr=arr[i]+arr[low]+arr[high];
               if(curr>=sum){
                    high--;
               }else{
                  count+=(high-low);
                   low++;
               }
           }
       } 
       return count;
    }
    public static void main(String[] args) {
        int arr[]={2,5,89,94,-8,456,-99,9};
        System.out.println(countTriplets(-15, arr));
    }
}
