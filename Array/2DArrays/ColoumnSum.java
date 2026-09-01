public class ColoumnSum {
     public static void sum(int arr[][],int Coloumnsum[]){
         for(int i=0;i<arr[0].length;i++){
            int sum=0;
            for(int j=0;j<arr.length;j++){
                sum+=arr[j][i];
            }
         Coloumnsum[i]=sum;
        }
    }
    public static void main(String[] args) {
         int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
         int Coloumnsum[]=new int[arr[0].length];
         sum(arr,Coloumnsum);
         for(int c:Coloumnsum){
            System.out.print(c+" ");
         }
    }
}
