package array.sorting;

public class QiuckSort {
    public static int Partition(int arr[],int low, int high){
      int pivot=arr[low];
      int i=low;
      int j=high;
      while(i<j){
        while(i<=high && arr[i]<=pivot ){
            i++;
        }
         while(j>=low && arr[j]>pivot ){
            j--;
        }
        if(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
      }
      int temp=arr[low];
      arr[low]=arr[j];
      arr[j]=temp;

      return j;
    }
    public static void quickSort(int arr[],int low,int high){
        if(low<high){
           int PIndex=Partition( arr,low, high);
           quickSort(arr, low, PIndex-1);
           quickSort(arr, PIndex+1, high);
        }
    }
    public static void main(String[] args) {
        int arr[]={4,6,2,5,7,9,1,3};

        quickSort(arr, 0, arr.length-1);
        for(int i :arr){
            System.out.print(i+"  ");
        }
    } 
}
