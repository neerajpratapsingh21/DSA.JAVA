package array.sorting;

public class SelectionSort {
    public static void selectionSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int minindex=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[minindex]){
                    minindex=j;
                }
                
           }
           int temp=arr[i];
                arr[i]=arr[minindex];
                arr[minindex]=temp;
        }
    }
    public static void main(String[] args) {
        int arr[]={5,4,1,3,2};
        selectionSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
}
