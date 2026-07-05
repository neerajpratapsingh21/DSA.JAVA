import java.util.HashMap;

public class ContainDuplicateII {
    // BruteForce Approach
    //Time Complexity - O(n^2)
    // Space Complexity -O(1)
    public boolean bruteForce(int[] nums, int k) {
       int n=nums.length;
       for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            if(nums[i]==nums[j] && (i-j) <= k){
                return true;
            }
        }
       }
       return false;
    }
    // Optimal Approach
    //Time Complexity - O(n)
    // Space Complexity -O(n)
    public static boolean optimalSolution(int nums[] , int k){
        int n=nums.length;
        HashMap <Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(nums[i]) && Math.abs(i-map.get(nums[i])) <= k){
                return true;
            }
            map.put(nums[i], i);
        }
        return false;
    }
    public static void main(String[] args) {
        int nums[]={1,2,3,1};
        System.out.println(optimalSolution(nums, 1));
    }
}
