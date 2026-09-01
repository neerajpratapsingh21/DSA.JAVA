package array;
import java.util.HashMap;

public class CountSubArraySumEqualsToK {
    // BruteForce Approach 
    //Time Complexity - O(n^3)
    //Space Complexity - O(1)
    public static int bruteforce(int arr[],int k){
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int sum=0;
                for(int m=i;m<=j;m++){
                    sum+=arr[m];
                }
                if(sum==k){
                    count++;
                }
            }
        }
        return count;
    }
    // Better Approach 
    //Time Complexity - O(n^2)
    //Space Complexity - O(1)
    public static int betterSolution(int arr[],int k){
     int count=0;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
                sum+=arr[j];
                if(sum==k){
                    count++;
                }
            }
        }
        return count;
    }
    // Optimal Solution using HashMap
    //Time Complexity - O(n)
    //Space Complexity - O(n)
   
    public static int optimalSolution(int arr[],int k){
        if(arr.length==0) return 0;
       HashMap <Integer,Integer> map=new HashMap<>();
       map.put(0, 1);
       int count=0;
       int prefixsum=0;
       for(int i=0;i<arr.length;i++){
        prefixsum+=arr[i];
        if(map.containsKey(prefixsum-k)){
            count+=map.get(prefixsum-k);
        }
      
        map.put(prefixsum, map.getOrDefault(prefixsum, 0)+1);
        
       }
       return count;
    }
public static void main(String[] args) {
        int arr[]={};
        // System.out.println(bruteforce(arr, 6));
      //  System.out.println(betterSolution(arr, 4));
      System.out.println(optimalSolution(arr, 3));
    }
}
