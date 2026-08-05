package binarysearch;

/**
 * CountOccurrrenceOfX
 */
public class CountOccurrrenceOfX {
     public static int first(int nums[],int target){
    int left=0;
    int right=nums.length-1;
    int ans=-1;
    while(left<=right){
        int mid = left + (right - left) / 2;
        if(nums[mid]==target){
            ans=mid;
            right=mid-1;
        }else if(nums[mid]<target){
            left=mid+1;
        }else{
            right=mid-1;
        }
    }
    return ans;
    }
    public static int last(int nums[],int target){
    int left=0;
    int right=nums.length-1;
    int ans=-1;
    while(left<=right){
        int mid = left + (right - left) / 2;
        if(nums[mid]==target){
            ans=mid;
            left=mid+1;
        }else if(nums[mid]>target){
            right =mid-1;
        }else{
            left=mid+1;
        }
    }
    return ans;
    }
    public static int  count(int arr[],int  x){
       int first=first(arr, x);
       if(first==-1) return 0;
       int last=last(arr, x);
        return (last-first)+1;
    }
public static void main(String[] args) {
    int arr[]={2,2,3,3,3,3,8};
    System.out.println(count(arr, 8));
}
    
}