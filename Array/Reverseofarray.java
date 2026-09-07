package array;


public class Reverseofarray {
 public static void ReverseArrUsingTwoPointers(int arr[]){
    int first=0;
    int last=arr.length-1;
    while(first<last){
        int temp=arr[last];
        arr[last]=arr[first];
        arr[first]=temp;
        first++;
        last--;
    }   
   }
   public static void reverseArrUsingRecursion(int arr[],int low,int high){
    if(low>=high){
      return ;
    }
    int temp=arr[low];
    arr[low]=arr[high];
    arr[high]=temp;
    reverseArrUsingRecursion(arr, low+1, high-1);
   }
   public static void main(String[] args) {
    int arr[]={10,20,40,50,30,20,60};
    for(int i : arr){
        System.out.print(i+" ");
    }
    System.out.println();
    reverseArrUsingRecursion(arr, 0, arr.length-1);
    for(int i : arr){
        System.out.print(i+" ");
    }
   }
    
}