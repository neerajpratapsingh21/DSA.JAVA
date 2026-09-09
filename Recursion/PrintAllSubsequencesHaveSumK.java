import java.util.ArrayList;
import java.util.List;

public class PrintAllSubsequencesHaveSumK {
    public static void printSubsequence(int arr[], List<Integer> list , int ind ,int n,int sum ,int k){
     if(ind>=n){
        // condition satisfied
       if(sum==k){
        for(int i : list){
            System.out.print(i+" ");
        }
        System.out.println();
       }
        return;
     }
     list.addLast(arr[ind]);
     // keep sum of particular subsequence
     sum+=arr[ind];
     // take or pick particular index into the subsequence 
     printSubsequence(arr, list, ind+1, n,sum,k);
     list.removeLast();
     sum-=arr[ind];
     // not pick condition , this element is not in your subsequence
     printSubsequence(arr, list, ind+1, n,sum,k);
    
    }
    
    public static void main(String[] args) {
         int arr[]={1,2,1};
       List<Integer> list = new ArrayList<>();
       int n=arr.length;
       int k=2;
       printSubsequence(arr, list, 0,n ,0,k);
    }
    
}
