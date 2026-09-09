import java.util.ArrayList;
import java.util.List;

public class CountAllSubsequencesHaveSumK {
     public static int printSubsequence(int arr[], List<Integer> list , int ind ,int n,int sum ,int k,int count){
        // condition not satisfy 
        // Strictly done when array contains only positive integers
        if(sum>k) return  0;
     if(ind>=n){
        // condition satisfied
       if(sum==k){
        return 1;
       }
   return 0 ;
     }
     list.addLast(arr[ind]);
     // keep sum of particular subsequence
     sum+=arr[ind];
     // take or pick particular index into the subsequence 
    int left= printSubsequence(arr, list, ind+1, n,sum,k,count);
     list.removeLast();
     sum-=arr[ind];
     // not pick condition , this element is not in your subsequence
   int right =  printSubsequence(arr, list, ind+1, n,sum,k,count);
   return  left+right;
        }
    
    public static void main(String[] args) {
         int arr[]={1,2,1};
       List<Integer> list = new ArrayList<>();
       int n=arr.length;
       int k=2;
       System.out.println(printSubsequence(arr, list, 0, n, 0, k, 0));
  
    }
}
