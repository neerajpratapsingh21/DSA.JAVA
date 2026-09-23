package array;

import java.util.Arrays;

/**
 * SquaringOfTwoSortedArray
 */
public class SquaringOfTwoSortedArray {
public int[] bruteforce(int[] nums) {
     for(int i=0;i<nums.length;i++){
        nums[i]=nums[i]*nums[i];
     }   
     Arrays.sort(nums);
     return nums;
    }
    public static  int[] optimalSolution(int[] nums) {
        int ans[]=new int[nums.length];
        int low=0;
        int high=nums.length-1;
        int i=nums.length-1;
        while(low<=high){
            if(Math.abs(nums[low]) > Math.abs(nums[high]) ){
            ans[i--]=nums[low]*nums[low];
            low++;
            }else{
                ans[i--]=nums[high]*nums[high];
                high--;
            }
        }
     return ans;
    }
    public static void main(String[] args) {
        int arr[]={-4,-1,0,3,10};
int result[]=optimalSolution(arr);
for(int i : result){
    System.out.print(i+" ");
}
    }
    
}