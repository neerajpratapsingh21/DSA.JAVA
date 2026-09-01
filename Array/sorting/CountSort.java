package array.sorting;

public class CountSort {
    public static void countSort(int arr[],int max){
        int count[]=new int[max+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        int k=0;
        for(int i=0;i<count.length;i++){
            if(count[i]!=0){
                arr[k]=i;
                k++;
                count[i]--;
              i--;
            }
            if(k==arr.length){
               return;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={1,4,1,3,2,4,3,7};
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++ ){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        countSort(arr,max);
        for(int i :arr){
            System.out.print(i+"  ");
        }
    }

}
