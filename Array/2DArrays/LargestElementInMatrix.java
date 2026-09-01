public class LargestElementInMatrix {
      public static int FindLargestElement(int arr[][]){
        int largest=arr[0][0];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
              if(arr[i][j]>largest){
                largest=arr[i][j];
              }
                }
                }
       return largest;
    }
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
     System.out.println(FindLargestElement(arr));
    }
}
