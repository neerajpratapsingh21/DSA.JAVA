package array;

import java.util.Arrays;

public class ThreeSumClosest {
    public static int threeSumClosest(int[] nums, int target) {
          int n=nums.length;
        Arrays.sort(nums);
      int ans=nums[0]+nums[1]+nums[2];
          for(int i=0;i<n-2;i++){
            int j=i+1;
            int k=n-1;
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                if(Math.abs(target-sum) < Math.abs(target-ans)){
                    ans=sum;
                }
                if(sum==target){
                      return sum;
                    }else if(sum<target){
                    j++;
                }else{
                    k--;
                }
            }
          }
          return ans;
    }
    public static void main(String[] args) {
        
    }
    
}
