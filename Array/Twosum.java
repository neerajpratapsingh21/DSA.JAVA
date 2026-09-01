package array;
import java.util.HashMap;

public class Twosum {
       public  static int[] Bruteforce(int[] nums, int target) {
for(int i = 0; i < nums.length; i++) {
for(int j = i + 1; j < nums.length; j++) {
if(nums[i] + nums[j] == target) {
return new int[]{i, j};
} } }
return new int[]{};
}
// Using Hashmap is Optimal when array is not given sorted.
public static int[] hashmapApproach(int nums[],int target){
HashMap <Integer,Integer> map=new HashMap<>();
for(int i=0;i<nums.length;i++){
int complement=target-nums[i];
if(map.containsKey(complement)){
 return new int[]{map.get(complement),i};
}
map.put(nums[i], i);
}
 return new int[]{-1,-1};
 }

// Optimal Only when The given Array is sorted otherwise hashmap approach is optimal (O(n)).
public static int[] optimal(int arr[],int target){
    int left = 0;
    int right = arr.length-1;
    while(left<right){
        if(arr[left]+arr[right]==target){
            return new int[]{left ,right};
        }else if(arr[left]+arr[right]<target){
            left++;
        }else{
            right--;
        }
    }
return new int[]{-1,-1};

}
    public static void main(String[] args) {
        int nums[]={1,2,5,64,2,3};    
        int arr[]={1,2,2,3,5,64};
       int result[]=hashmapApproach(nums, 5);
       int sort[]=optimal(arr, 5);
      for(int i=0;i<result.length;i++){
        System.out.print(result[i]+" ");
       }
        for(int i=0;i<sort.length;i++){
        System.out.print(sort[i]+" " );
       }
    }
}

