package binarysearch;



public class SearchInRotatedSortedArray {
public static int search(int arr[] , int target){
    int low=0;
    int high=arr.length-1;
    while(low<=high){
        int mid=low+(high-low)/2;
        if(arr[mid]==target){
           return mid;
        }
             // left half
             if(arr[low]<=arr[mid]){
                if(target<arr[mid] && target>=arr[low]){
                    high= mid-1;

                }else{
                    low = mid+1;
                }
             }
             // right half 
             else{
                if(target>arr[mid] && target <=arr[high]){
                    low =mid+1;

                } 
            else{
                high=mid-1;
            }}   
    }
    return -1;
    
}
    public static void main(String[] args) {
        int arr[]={4,5,6};
       
        System.out.println(search(arr, 5));
    }
}
