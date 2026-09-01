package array;

import java.util.Arrays;
import java.util.HashSet;


public class LongestConsicutiveSequence {
    public static boolean linearSearch(int nums[],int num){
      for(int i=0;i<nums.length;i++){
            if(nums[i]==num){
                return true;
            }
        }
        return false;
    }
    public static int bruteForce(int nums[]){
        if(nums.length == 0){
    return 0;
}
        int maxlength=1;
        for(int i=0;i<nums.length;i++){
            int x=nums[i];
            int count=1;
            while(linearSearch(nums, x+1)==true){
                x=x+1;
                count=count+1;
}
maxlength=Math.max(maxlength, count);
        }
        return maxlength;
    }
public static int betteApproach(int nums[]){
    int n=nums.length;
     if(n == 0){
    return 0;
}
    Arrays.sort(nums);
    int maxlength=1;
    int last_smaller=Integer.MIN_VALUE;
int count=0;
    for(int i=0;i<n;i++){
        if(nums[i]-1==last_smaller){
     count+=1;
     last_smaller=nums[i];
}else if(nums[i]!=last_smaller){
         count=1;
         last_smaller=nums[i];
}
maxlength=Math.max(maxlength, count);
    }
    return maxlength;
}
public static int optimalSolition(int nums[]){
    int n=nums.length;
     if(n == 0) return 0;

 HashSet <Integer> set=new HashSet<>();
 for(int i=0;i<nums.length;i++){
    set.add(nums[i]);
 }
 int maxlength=1;
 for(int i:set){
    if(!set.contains(i-1)){
         int count=1;
         int x=i;
         while(set.contains(x+1)){
              x=x+1;
              count=count+1;
    }
    
    maxlength=Math.max(count, maxlength);
    }
 }
 return maxlength;
}
    public static void main(String[] args) {
        int nums[]={100,4,200,2,1,3};
       System.out.println(optimalSolition(nums));
    }
}
