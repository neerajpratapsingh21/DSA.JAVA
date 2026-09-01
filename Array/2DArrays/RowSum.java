public class RowSum {
    public static void sum(int arr[][],int Rowsum[]){
         for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=0;j<arr[0].length;j++){
                sum+=arr[i][j];
            }
         Rowsum[i]=sum;
        }
    }
    public static void main(String[] args) {
         int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
         int Rowsum[]=new int[arr.length];
         sum(arr,Rowsum);
         for(int r:Rowsum){
            System.out.print(r+" ");
         }
    }
}
