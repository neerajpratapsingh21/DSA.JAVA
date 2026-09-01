public class RotateMatrix90Degree {
    public static void Rotate(int arr[][]){
        // Transpose matrix (In-place)
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(i>j){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
            }
        }
     //Reverse Each row of matrix
  for(int i=0;i<arr.length;i++){
    int left=0;
  int right=arr.length-1;
    while(left<right){
       int temp=arr[i][left];
       arr[i][left]=arr[i][right];
       arr[i][right]=temp;
       left++;
       right--;
    }
  }
    }
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        Rotate(arr);
       for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }
    }
}
