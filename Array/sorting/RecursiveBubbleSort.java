package array.sorting;

public class RecursiveBubbleSort {
     public static void recursiveBubbleSort(int arr[],int n){
        if(n<=1) return;
        boolean swap=false;
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
                swap=true;
            }
        }
        if(!swap) return;
recursiveBubbleSort(arr, n-1);
    }
    public static void main(String[] args) {
         int arr[] = {5,1,2,3,4};
     recursiveBubbleSort(arr, arr.length);
  for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
        
    }
}
