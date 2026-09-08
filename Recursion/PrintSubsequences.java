import java.util.ArrayList;
import java.util.List;

public class PrintSubsequences {
    public static void print(List<Integer> list){
        for(int it : list){
            System.out.print(it+" ");
        }
        if(list.size()==0){
            System.out.print("{}");
        }
        System.out.println();
    }
    public static void printSubsequence(int arr[], List<Integer> list , int ind ,int n ){
     if(ind>=n){
        print(list);
        return;
     }
     list.addLast(arr[ind]);
     // take or pick particular index into the subsequence 
     printSubsequence(arr, list, ind+1, n);
     list.removeLast();
     // not pick condition , this element is not in your subsequence
     printSubsequence(arr, list, ind+1, n);
     
    }
    public static void main(String[] args) {
       int arr[]={3,1,2};
       List<Integer> list = new ArrayList<>();
       int n=arr.length;
       printSubsequence(arr, list, 0,n );
    }
}
