package binarysearch;
public class FirstAndLastPositionInSortedArray {
    public static int first(int nums[],int target){
 int left=0;
    int right=nums.length-1;
    int ans=-1;
    while(left<=right){
        int mid=(left+right)/2;
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
        int mid=(left+right)/2;
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
    public static int[] firstandlast(int nums[],int target){
        return new int[]{first(nums,target),last(nums,target)};
   
}
    public static void main(String[] args) {
        int nums[]={5 ,7,7,8,8,9};
       int result[]=firstandlast(nums, 8);
       for(int i:result){
        System.out.print(i+" ");
       }
    }
}
