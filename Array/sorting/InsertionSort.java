package array.sorting;

public class InsertionSort {
    public static void insertionSort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int j=i;
            while(j>0 && arr[j]<arr[j-1]){
              
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                   
               
                 j--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={14,9,15,12,6,8,13};
        insertionSort(arr);
        for(int it :arr){
            System.out.print(it+" ");
        }
    }
}
