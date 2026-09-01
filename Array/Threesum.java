package array;
import java.util.*;
public class Threesum {
    public static List<List<Integer>> bruteforce(int nums[]){
          Set<List<Integer>> st = new HashSet<>();
for(int i=0;i<nums.length;i++){
    for(int j=i+1;j<nums.length;j++){
        for(int k=j+1;k<nums.length;k++){
           if(nums[i]+nums[j]+nums[k]==0){
            List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k]);
                         Collections.sort(temp);
                        st.add(temp);
        }
        }
    }
}
return new ArrayList<>(st);
    }
    public static List<List<Integer>> betterSolution(int nums[]){
    int n=nums.length;
    Set<List<Integer>> ans = new HashSet<>();
         for (int i = 0; i < n; i++) {
            Set<Integer> hashset = new HashSet<>();
            for (int j = i + 1; j < n; j++) {
                int third = -(nums[i] + nums[j]);
                if (hashset.contains(third)) {
                    List<Integer> temp = Arrays.asList(nums[i], nums[j], third);
                    Collections.sort(temp);
                    ans.add(temp);
                }
                hashset.add(nums[j]);
            }
        }
        return new ArrayList<>(ans);
    }
    public static List<List<Integer>> optimalSolution(int nums[]){
        int n=nums.length;
        Arrays.sort(nums);
        List<List<Integer>> ans=new ArrayList<>();
          for(int i=0;i<n-2;i++){
            if(i>0 && nums[i-1]==nums[i]) continue;
            int j=i+1;
            int k=n-1;
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                if(sum == 0){
                    List <Integer> temp = Arrays.asList(nums[i],nums[j],nums[k]);
                    ans.add(temp);
                    j++;
                    k--;
                    while(j<k && nums[j]==nums[j-1]) j++;
                    while(j<k && nums[k]==nums[k+1]) k--;
                }else if(sum<0){
                    j++;
                }else{
                    k--;
                }
            }
          }
          return ans;
    }

    public static void main(String[] args) {
         int nums[]={-1, 0, 1, 2, -1, -4};
        System.out.println(optimalSolution(nums));
      }
}
