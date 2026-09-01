public class SpiralMatrix {
    public static void printSpiral(int arr[][]){
        
       int startrow=0;
       int endrow=arr.length-1;
       int startcol=0;
       int endcol=arr[0].length-1;
        while(startrow<=endrow && startcol<=endcol){
        //Top
        for(int j=startcol;j<=endcol;j++){
               System.out.print(arr[startrow][j]+"  ");
        }
         //Right
        for(int i=startrow+1;i<=endrow;i++){
           System.out.print(arr[i][endcol]+"  ");
        }
        //Bottom
        if(startrow < endrow){
    for(int j=endcol-1;j>=startcol;j--){
            System.out.print(arr[endrow][j]+"  ");
        }
}
//Left
if(startcol < endcol){
     for(int i=endrow-1;i>=startrow+1;i-- ){
            System.out.print(arr[i][startcol]+"  ");
        }
}
startrow++;
endrow--;
startcol++;
endcol--;
       }
    }
    public static void main(String[] args) {
        int arr[][]={{1,2,3,4,5},{6,7,8,10,11},{1,1,1,1,1}};
        printSpiral(arr);
    }
}
