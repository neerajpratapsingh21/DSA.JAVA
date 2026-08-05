package binarysearch;

import java.util.ArrayList;
import java.util.List;

public class FlourAndCeil {
     public static int flour(int arr[], int x){
        int low=0;
        int high=arr.length-1;
        int ans=-1;
         while(low<=high){
            int mid=low+(high-low)/2;
           if(arr[mid]<=x){
            ans=arr[mid];
            low=mid+1;
           }else{
            high=mid-1;
           }
        }
        return ans;
     }
      public static int ceil(int arr[], int x){
        int low=0;
        int high=arr.length-1;
        int ans=-1;
         while(low<=high){
            int mid=low+(high-low)/2;
           if(arr[mid]>=x){
            ans=arr[mid];
            high=mid-1;
             }else{
            low=mid+1;
           }
        }
        return ans;
     }
    public static List<Integer> flourAndCeil(int arr[],int x){
        List<Integer> ans=new ArrayList<>();
        ans.add(flour(arr, x));
        ans.add(ceil(arr, x));
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={10,20,30,40};
       System.out.println(flourAndCeil(arr, 0));
    }
}
