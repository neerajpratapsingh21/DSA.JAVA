package array;
import java.util.ArrayList;

public class LeadersInArray {
// BruteForce Solution
// Time : O(n^2)
// Space : O(1)
    public static void bruteForce(int arr[]){
        int n=arr.length;
        if(n==1){
            System.out.println(arr[0]);
            return;
        }
       
        for(int i=0;i<n-1;i++){
            boolean isLeader=true;
            for(int j=i+1;j<n;j++){
              if(arr[i]<arr[j]){
                isLeader=false;
                break;
              }
            }
            if(isLeader){
                System.out.print(arr[i]+"  ");
            }
        }
         System.out.print(arr[n-1]+"  ");
    }
// Optimal Solution
// Time : O(n)
// Space : O(n)
    public static void optimalSolution(int arr[]){
        int n=arr.length;
         if(n==1){
            System.out.println(arr[0]);
            return;
        }
    int rightmax=arr[n-1];
    ArrayList <Integer> list=new ArrayList<>();
    list.add(rightmax);
     for(int i=n-2;i>=0;i--){
        if(arr[i]>=rightmax){
           list.add(arr[i]);
            rightmax=arr[i];
        }
      }
    for(int i=list.size()-1;i>=0;i--){
        System.out.print(list.get(i)+"  ");
    }

    }
    public static void main(String[] args) {
        int arr[]={4,7,1,0};
        optimalSolution(arr);
      //  bruteForce(arr);
    }
}
