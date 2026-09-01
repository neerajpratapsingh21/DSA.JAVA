package array;


public class Reverseofarray {
 public static void ReverseofArray(int arr[]){
    int first=0;
    int last=arr.length-1;
    while(first<last){
        int temp=arr[last];
        arr[last]=arr[first];
        arr[first]=temp;
        first++;
        last--;
    }
    for(int i=0;i<arr.length;i++){
System.out.print(arr[i]+" ");
    }
   
   }
   public static void main(String[] args) {
    int arr[]={10,20,40,50,30,20,60};
    ReverseofArray(arr);
   }
    
}