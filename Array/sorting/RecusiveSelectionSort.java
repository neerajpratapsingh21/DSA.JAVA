package array.sorting;

public class RecusiveSelectionSort {
     public static void recusiveSelectionSort(int arr[],int i ,int n){
     if(i >= n-1) return;
     int minindex=i;
     for(int j=i;j<n;j++){
        if(arr[j]<arr[minindex]){
            minindex=j;
        }
     }
     if(minindex!=i){
     int temp=arr[i];
     arr[i]=arr[minindex];
     arr[minindex]=temp;
     }
    recusiveSelectionSort(arr, i+1, n);
     }
    public static void main(String[] args) {
         int arr[]={5,4,3,2,1};
        recusiveSelectionSort(arr,0,arr.length);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
