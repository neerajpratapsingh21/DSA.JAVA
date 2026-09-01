public class TransposeMatrix {
    public static void Transpose(int arr[][]){
        int row=arr.length;
        int col=arr[0].length;
        int Trans[][]=new int[col][row];
        for(int i=0;i<col;i++){
            for(int j=0;j<row;j++){
                Trans[i][j]=arr[j][i];
            }
        }
       for(int i=0;i<col;i++){
        for(int j=0;j<row;j++){
            System.out.print(Trans[i][j]+"  ");
        }
        System.out.println();
       }
    }
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{5,6,4}};
        Transpose(arr);
        }
    
}
