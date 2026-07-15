package array;

public class BinarySearch {
    // Time : O(log(n))
    // Space : O(1)
    public static void Binarysearch(int arr[],int key){
        int f=0;
        int l=arr.length-1;
        
        while(f<=l){
            int mid=(f+l)/2;

            if(arr[mid]==key){
                System.out.println("Found at : "+mid);
                return;
            }else if(arr[mid]<key){
                f=mid+1;
            }else{
                l=mid-1;
            }
        }
        System.out.println("not found");
        
    }
    public static void main(String[] args) {
        int arr[]={1};
        int key=4;
        Binarysearch(arr,key);
    }
}
