public class MaximumAverageSubArray {
    public static double bruteForce(int nums[],int k){
        int n=nums.length;
        double maxAvg=-Double.MAX_VALUE;
        for(int left=0;left<=n-k;left++){
            int right=k-1+left;
            double sum=0;
            for(int i=left;i<=right;i++){
                sum += nums[i];
             }
            double avg=sum/k;
            maxAvg=Math.max(maxAvg, avg);
        }
        return maxAvg;
    }
    public static double optimalSolution(int nums[], int k){
        
        int n=nums.length;
        double maxAvg=-Double.MAX_VALUE;
        double sum=0;
        int right=k-1;
         int left=0;
        for(int i=0;i<n;i++){
           sum += nums[i];
            if(i==right){
            double avg=sum/k;
            maxAvg=Math.max(maxAvg, avg);
            sum=sum-nums[left];
         left++;
         right++;
            }
        }
        return maxAvg;
    }
    public static void main(String[] args) {
        int nums[]={-1};
        int k=1;
        System.out.println(optimalSolution(nums, k));
        System.out.println(bruteForce(nums, k));
    }
}
