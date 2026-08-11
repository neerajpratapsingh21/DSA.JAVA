package binarysearch;

import java.util.Arrays;

public class AgressiveCows {
     
    public static boolean canWePlace(int arr[],int dist,int cows){
        int countcow=1; int last=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]-last>=dist){
                countcow++;
                last=arr[i];
            }
           }
          if(countcow>=cows) return true;
            else{return false;}
    }
    public static int bruteForce(int arr[],int cows){
       
      //  Arrays.sort(arr);
        int n=arr.length;
         
        for(int i=1;i<=arr[n-1]-arr[0];i++){
            if(canWePlace(arr, i, cows)){
            continue;
            }else{
                return i-1;
            }
        }
        return -1;
    }
    public static int optimalSolution(int arr[],int cows){
        int n=arr.length;
        Arrays.sort(arr);
   
     int low=1;
     int high=arr[n-1]-arr[0];
        while(low<=high){
            int mid=low+(high-low)/2;
            if(canWePlace(arr, mid, cows)){
            low =mid+1;
            }else{
                high=mid-1;
            }
        }
        return high;
    } 
    public static void main(String[] args) {
        int arr[]={0,3,4,7,10,9};
        System.out.println(bruteForce(arr, 4));
    }
}
