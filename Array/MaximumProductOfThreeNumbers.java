import java.util.Arrays;


public class MaximumProductOfThreeNumbers {
    
    public int bruteForce(int[] nums) {
        int n=nums.length;
        int maxProduct=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    int curr=nums[i]*nums[j]*nums[k];
                    maxProduct=Math.max(curr,maxProduct);
                }
                }
                }
                return maxProduct;
            }
            public int betterSolution(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int product1=nums[n-1]*nums[n-2]*nums[n-3];
        int product2=nums[0]*nums[1]*nums[n-1];

                return Math.max(product1,product2);
            }
            public static int optimalSolution(int nums[]){
        long max=Long.MIN_VALUE;
        long smax=Long.MIN_VALUE;
        long tmax=Long.MIN_VALUE;
   long small1=Long.MAX_VALUE;
   long small2=Long.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=max){
                tmax=smax;
                smax=max;
                max=nums[i];
            }else if(nums[i]>smax ){
                tmax=smax;
                smax=nums[i];
            }else if(nums[i]>tmax ){
                tmax=nums[i];
            }

            if(nums[i]<small1){
                small2=small1;
                small1=nums[i];

            }else if(nums[i]<small2 ){
                small2=nums[i];
            }
        }
    long product1=max*smax*tmax;
    long product2=small1*small2*max;
    return (int) Math.max(product1, product2);
            }
            
public static void main(String[] args) {
    int nums[]={3,3,2};
    System.out.println(optimalSolution(nums));
}
    
}