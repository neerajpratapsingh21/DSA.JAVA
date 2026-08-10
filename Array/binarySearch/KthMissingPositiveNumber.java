package binarysearch;

/**
 * KthMissingPositiveNumber
 */
public class KthMissingPositiveNumber {
    public static int bruteForce(int arr[],int k){
        if(arr[0]>k) return k;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=k){
                k++;
            }else{
                return k;
            }
        }
        return k;
    //      int max=Integer.MIN_VALUE;
    
    // for(int i:  arr){
    //     max=Math.max(max, i);
       
    // }
    //     int count=0;
        
    //     for(int i=1;i<=max+k;i++){
    //         int innercount=0;
    //         for (int j=0;j<arr.length;j++){
    //           if(i==arr[j]){
    //             break;
    //             }else{
    //                 innercount++;
    //             }

    //                }
    //         if(innercount==arr.length){
    //               count++;
    //             }
    //         if(count == k){
    //             return i;
    //         }
    //     }
    //     return -1;

    }
    public static int binarySearchSolution(int arr[],int k){
        int low = 0 ;
        int high = arr.length-1;
        while(low<=high){
            int mid=low +(high-low)/2;
            int missing=arr[mid]-(mid+1);
            if(missing<k){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return low +k;
    }
public static void main(String[] args) {
    int arr[]={2,3,4,7,11};
    System.out.println(binarySearchSolution(arr, 5));
}
    
}