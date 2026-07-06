import java.util.*;
public class FourSum {
    //BruteForce Approach
     // Time Complexity-O(n^4)
    //Space Complexity-O(n^2)
     public List<List<Integer>> bruteForce(int[] arr, int target) {
        int n = arr.length;
        // Use set to avoid duplicate quadruplets
        Set<List<Integer>> set = new HashSet<>();
        // First loop - pick first element
        for (int i = 0; i < n; i++) {
            // Second loop - pick second element
            for (int j = i + 1; j < n; j++) {
                // Third loop - pick third element
                for (int k = j + 1; k < n; k++) {
                    // Fourth loop - pick fourth element
                    for (int l = k + 1; l < n; l++) {
                        long sum = (long) arr[i] + arr[j] + arr[k] + arr[l];
                        if (sum == target) {
                            List<Integer> temp = Arrays.asList(arr[i], arr[j], arr[k], arr[l]);
                            // Sort to maintain uniqueness
                            Collections.sort(temp);
                            set.add(temp);
                        }
                    }
                }
            }
        }
        // Convert set to list and return
        return new ArrayList<>(set);
    }
    // Better Approach
    // Time Complexity-O(n^3)
    //Space Complexity-O(n)
      public List<List<Integer>> betterSolution(int[] arr, int target) {
        int n = arr.length;
        Set<List<Integer>> set = new HashSet<>();
// First loop - pick first number
        for (int i = 0; i < n; i++) {
// Second loop - pick second number
    for (int j = i + 1; j < n; j++) {
  // HashSet for numbers between j and k
HashSet<Integer> seen = new HashSet<>();
// Third loop - pick third number
    for (int k = j + 1; k < n; k++) {
                    // Find required fourth number
 long required = (long) target - arr[i] - arr[j] - arr[k];
 // If required number already seen → valid quadruplet
    if (seen.contains((int) required)) {
        List<Integer> temp = Arrays.asList(arr[i], arr[j], arr[k], (int) required);
        Collections.sort(temp);
        set.add(temp);
            }
// Add current third number into set
                    seen.add(arr[k]);
                }
            }
        }
        return new ArrayList<>(set);
    }
// Optimal Approach
 // Time Complexity-O(n^3)
    //Space Complexity-O(1)
    public static List<List<Integer>> optimalSolution(int nums[],int target){
        int n=nums.length;
        //Sorting
        Arrays.sort(nums);
    List<List<Integer>> ans=new ArrayList<>();
    // First loop - pick first number
    for(int i=0;i<n-3;i++){
        if(i>0 && nums[i]==nums[i-1]) continue;
        // Second loop - pick second number
        for(int j=i+1;j<n-2;j++){
            if(j>1+i && nums[j]==nums[j-1]) continue;
            // left pick Third number -right pick fourth number
            int left=j+1;
            int right=n-1;
            
            while(left<right){
                 long sum=(long)nums[i]+nums[j]+nums[left]+nums[right];
                  if(sum==target){
                    List <Integer> temp=  Arrays.asList(nums[i],nums[j],nums[left],nums[right]);
                    ans.add(temp);
                    left++;
                    right--;
                    while(left<right && nums[left]==nums[left-1]) left++;
                    while(left<right && nums[right]==nums[right+1]) right--;
                  }else if(sum<target){
                    left++;
                  }else{
                    right--;
                  }
            }
        }
    }
    return ans;

    }

public static void main(String[] args) {
    int nums[]={1000000000,1000000000,1000000000,1000000000};
    System.out.println(nums);
}    
}