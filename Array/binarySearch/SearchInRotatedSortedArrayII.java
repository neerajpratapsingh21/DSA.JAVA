package array.binarySearch;

public class SearchInRotatedSortedArrayII {
     public  static boolean search(int[] nums, int x) {
         int low=0;
      int high=nums.length-1;
      while(low<=high){
        int mid= low+(high-low)/2;
        if( nums[mid]==x){
          return true;
        }
        if(nums[low] == nums[mid] && nums[mid]==nums[high]){
            low++;
            high--; 
            continue;
        }
        
        // left half 
        if(low<=high && nums[low]<=nums[mid]){
        if(nums[low]<=x && x<nums[mid]){
          high=mid-1;
        }else{
          low =mid+1;
        }
      }else{
        if( low<=high && nums[mid]<x && x<=nums[high]){
           low =mid+1;  
        }else{
          high=mid-1;
        }
      }
      }
      return false;
    }
    public static void main(String[] args) {
        int arr[]={1,0,1,1,1};
        System.out.println(search(arr, 0));
    }
}
