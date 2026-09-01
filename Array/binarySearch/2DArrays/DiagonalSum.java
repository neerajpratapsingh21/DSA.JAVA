public class DiagonalSum {
    public static int Bruteforce(int arr[][] ){
        int temp=0;
        int primary=0;
        int secondary=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                  if(i==j){
                primary+=arr[i][j];
                  }
                  if(i+j==arr.length-1){
                   secondary+=arr[i][j];
                  }
                  
                  if(i==j && arr.length-i-j-1==0){
                    temp=arr[i][j];
                  }
            }
        }
        return primary+secondary-temp;
    }
    public static int Optimal(int arr[][]){
        int n=arr.length;
         int primary=0;
        int secondary=0;
        int temp=0;
        for(int i=0;i<n;i++){
       primary+=arr[i][i];
       secondary+=arr[i][n-i-1];
       if(i==n-i-1){
     temp=arr[i][i];
       }
        }
        return primary+secondary-temp;
    }
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Optimal(arr));
    }
}
