package array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MajorityElementII {
    // Brute Force Approach 
    //Time Complexity - O(n^2)
    //Space Complexity - O(1)
    public static List<Integer> bruteForce(int nums[]){
    int n=nums.length;
   List <Integer> res=new ArrayList<>();
   for(int i=0;i<n;i++){
    int candidate=nums[i];
    int count=0;
 for(int j=0;j<n;j++){
    if(nums[j]==candidate){
        count++;
    }
 }
 if(count>n/3 && !res.contains(candidate)){
    res.add(candidate);
 }
   }
   return res;
    }
    // Using HashMap 
    //Time Complexity - O(n)
    //Space Complexity - O(n)
    public static List<Integer> betterApproach(int nums[]){
        int n=nums.length;
    List <Integer> res=new ArrayList<>();
    HashMap <Integer,Integer> map=new HashMap<>();
    for(int i=0;i<n;i++){
    map.put(nums[i],map.getOrDefault(nums[i], 0)+1);
    }
for(int key:map.keySet()){
    if(map.get(key)>n/3){
         res.add(key);
    }
}
return res;
    }
// boyer-Moore's Voting Algorithm
//Time Complexity - O(n)
//Space Complexity - O(1)
    public static List<Integer> optimalSolution(int nums[]){
        int n=nums.length;
        List<Integer> res=new ArrayList<>();
        int candidate1=nums[0];
        int count1=0;
        int candidate2=nums[0];
        int count2=0;
       for(int i=0;i<n;i++){
        if(count1==0 && candidate2 != nums[i]){
     candidate1=nums[i];
     count1++;
        }else if(count2==0 && candidate1 != nums[i]){
        candidate2=nums[i];
        count2++;
       }else if(candidate1==nums[i]){
        count1++;
       }else if(candidate2==nums[i]){
        count2++;
    }else{
        count2--;
        count1--;
       }
       }
       // Verifying candidates 
    int  occurrence1=0;
    int occurrence2=0;
       for(int i=0;i<n;i++){
         if(nums[i]==candidate1){
            occurrence1++;
         }else if(nums[i]==candidate2){
           occurrence2++;
         }
       }
       if(occurrence1>n/3){
        res.add(candidate1);
       }
       if(occurrence2>n/3){
        res.add(candidate2);
       }
       return res;
    }

    public static void main(String[] args) {
        int nums[]={1,1,1,2,3,2,2,2,1};
        System.out.println(optimalSolution(nums));
    }
}
