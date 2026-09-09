import java.util.ArrayList;
import java.util.List;

public class PrintOneSubsequenceHasSumK {
      public static boolean printSubsequence(int arr[], List<Integer> list , int ind ,int n,int sum ,int k){
     if(ind>=n){
        // condition satisfied
       if(sum==k){
        for(int i : list){
            System.out.print(i+" ");
        }
        return  true;
       }
        // condition not  satisfied
       else{
        return  false;
       }  
     }
     list.addLast(arr[ind]);
     // keep sum of particular subsequence
     sum+=arr[ind];
     // take or pick particular index into the subsequence 
     if(printSubsequence(arr, list, ind+1, n,sum,k)){
        return true;
     }
     list.removeLast();
     sum-=arr[ind];
     // not pick condition , this element is not in your subsequence
     if(printSubsequence(arr, list, ind+1, n,sum,k)){
        return true;
     }
     return false;
    
    }
    
    public static void main(String[] args) {
         int arr[]={1,2,1};
       List<Integer> list = new ArrayList<>();
       int n=arr.length;
       int k=6;
       printSubsequence(arr, list, 0,n ,0,k);
    }
    
}
