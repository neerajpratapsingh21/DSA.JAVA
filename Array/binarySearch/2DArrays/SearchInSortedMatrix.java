public class SearchInSortedMatrix {
    public static void search(int arr[][],int key){
        int row=arr.length-1;
        int col=0;
        while(row>=0 && col<arr[0].length){
             if(arr[row][col]==key){
            System.out.println(key+" Found At index : "+"("+row+","+col+")");
            return;
        }
          else  if(arr[row][col]<key){
                col++;
            }else{
                row--;
            }
        }
              System.out.println(key+" Not present in the array.");
        

    }
    public static void main(String[] args) {
        int arr[][]={{1,4,7,11},{2,5,8,12},{3,6,9,16},{10,13,14,17}};
        search(arr, 8);
    }
    
}
