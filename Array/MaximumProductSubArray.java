public class MaximumProductSubArray {
    // BruteForce Approach
    //Time Complexity - O(n^2)
    // Space Complexity -O(1)
    public int bruteForce(int[] nums) {
        int n=nums.length;
        int maxProduct=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int currproduct=1;
            for(int j=i;j<n;j++){
                currproduct *= nums[j];
            maxProduct=Math.max(maxProduct,currproduct);
            }
        }
        return maxProduct;
    }
     // Optimal Approach 
     // Track of the Minimum and Maximum Product , end at curr/last Index 
    //Time Complexity - O(n)
    // Space Complexity -O(1)
    public int optimalSolution(int[] nums) {
        int n=nums.length;
        int result=nums[0];
        int minProduct=nums[0];
        int maxProduct=nums[0];
        for(int i=1;i<n;i++){
            int curr=nums[i];
            if(curr<0){
                int temp=maxProduct;
                maxProduct=minProduct;
                minProduct=temp;
            }
            maxProduct=Math.max(curr,maxProduct*curr);
            minProduct=Math.min(curr,minProduct*curr);

            result=Math.max(result,maxProduct);

        }
        return result;
    }
    public static void main(String[] args) {
        
    }
}
