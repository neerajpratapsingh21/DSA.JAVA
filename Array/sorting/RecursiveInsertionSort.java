package array.sorting;

public class RecursiveInsertionSort {
    public static void recursiveInsertionSort(int arr[], int i ,int n){

     if (i>= n) return;

        int j = i;
        // Move the current element back until it's in the correct place
        while (j > 0 && arr[j - 1] > arr[j]) {
            // Swap arr[j] and arr[j-1]
            int temp = arr[j - 1];
            arr[j - 1] = arr[j];
            arr[j] = temp;
            j--;
        }

        // Recur for the next index
        recursiveInsertionSort(arr, i + 1, n);
    }
    public static void main(String[] args) {
         int arr[]={14,9,15,12,6,8,13};
       recursiveInsertionSort(arr, 0, arr.length);
        for(int it :arr){
            System.out.print(it+" ");
        }
    }
}
