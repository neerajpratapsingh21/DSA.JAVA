package array;
// Time : O(n)
// Space: O(n)
import java.util.ArrayList;
public class RearrangeArrayBySign {
    // Brute Force / Better Approach using two ArrayLists
public static void bruteForce(int arr[]){
    int n=arr.length;
   ArrayList<Integer> pos = new ArrayList<>();
ArrayList<Integer> neg = new ArrayList<>();

    for(int i=0;i<n;i++){
        if(arr[i]<0){
           neg.add(arr[i]);
        }else{
            pos.add(arr[i]);
        }
    }
    for(int i=0;i<n/2;i++){
        arr[2*i]=pos.get(i);
        arr[2*i+1]=neg.get(i);
    }
}
// Optimal Approach when number of positive and negative elements are equal.
 public static int[] rearrangeArray(int[] nums) {
        int ans[]=new int[nums.length];
        int pos=0;
        int neg=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                ans[neg]=nums[i];
                neg+=2;
            }else{
                ans[pos]=nums[i];
                pos+=2;
            }
        }
        return ans;
    }
    // if there is positive != negative 
    // Variation: Handles unequal positive and negative elements.
    public  static void rearrangeUnequalSigns(int arr[]){
        int n=arr.length;
   ArrayList<Integer> pos = new ArrayList<>();
   ArrayList<Integer> neg = new ArrayList<>();
    for(int i=0;i<n;i++){
        if(arr[i]<0){
           neg.add(arr[i]);
        }else{
            pos.add(arr[i]);
        }
    }
    int commonLength=Math.min(pos.size(), neg.size());
    for(int i=0;i<commonLength;i++){
        arr[2*i]=pos.get(i);
        arr[2*i+1]=neg.get(i);
    }
    int index=commonLength*2;
    if(pos.size()>neg.size()){
        for(int i=commonLength;i<pos.size();i++){
            arr[index]=pos.get(i);
            index++;
        }
    }else if(pos.size()<neg.size()){
        for(int i=commonLength;i<neg.size();i++){
            arr[index]=neg.get(i);
            index++;
        }
    }
    }
    public static void main(String[] args) {
        int arr[]={3,1,-2,5,2,-4};
        int nums[]={1,2,-1,5,-2,-4};
     // bruteForce(arr);
     // rearrangeUnequalSigns(arr);
     int result[]=rearrangeArray(nums);
        for(int i:result){
            System.out.print(i+"  ");
        }
    }
}