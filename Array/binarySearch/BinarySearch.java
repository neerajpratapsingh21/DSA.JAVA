package binarysearch;



public class BinarySearch {
    public static int Binarysearch(int arr[],int key){
        int f=0;
        int l=arr.length-1;
        
        while(f<=l){
          int mid = f + (l - f) / 2;

            if(arr[mid]==key){
                return mid;
               
            }if(arr[mid]<key){
                f=mid+1;
            }if(arr[mid]>key){
                l=mid-1;
            }
        }
        return  -1;
        
    }
    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2};
        int key=0;
       System.out.println(Binarysearch(arr,key)); 
    }
}
