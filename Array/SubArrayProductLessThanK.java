package array;

public class SubArrayProductLessThanK {
     public static  int numSubarrayProductLessThanK(int[] nums, int k) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            long product=1;
            for(int j=i;j<nums.length;j++){
               product *= nums[j];
               if(product < k) count++;
               if(product >= k) break;
            }
        }
        return count;
    }
    public static int optimalSolution(int[] nums,int k){
        if(k<=1) return 0;
        int count=0;
        int left=0;
        int right=0;
        long product=1;
        while(right<nums.length){
            product*=nums[right];

            while(product>=k){
                product/=nums[left];
                left++;
            }
            count+=(right-left)+1;
            right++;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(optimalSolution(new int[]{5,165,4,621,7}, 125));
    }
}
