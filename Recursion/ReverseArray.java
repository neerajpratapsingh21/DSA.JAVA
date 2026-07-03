public class ReverseArray {
    public static void reverse(int arr[],int left,int right){
       if(left>=right) return ;

            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            reverse(arr, left+1, right-1);
        }
        public static void forfun(int i,int arr[],int n){
            if(i>=n/2) return;
          int temp=arr[i];
          arr[i]=arr[n-i-1];
          arr[n-i-1]=temp;
         forfun(i+1, arr, n);
        }

    
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int n=arr.length;
        forfun(0, arr, n);
        for( int array :arr){
            System.out.print(array+" ");
        }
    }
}
