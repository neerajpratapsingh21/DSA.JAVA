package array;
import java.util.HashMap;

public class LongestSubArraywithsumK {
    public static int Bruteforce(int arr[],int k){
        int maxLength=0;
        for(int i=0;i<arr.length;i++){
        for(int j=i;j<arr.length;j++){
            int sum=0;
            for(int l=i;l<=j;l++){
                sum+=arr[l];
            }
            if(sum==k){
                maxLength=Math.max(maxLength, (j-i+1));
            }
        }
        }
        return maxLength;
    }
    public static int BetterApproach(int arr[],int k){
         int maxLength=0;
        for(int i=0;i<arr.length;i++){
             int sum=0;
        for(int j=i;j<arr.length;j++){
           sum+=arr[j];
           if(sum==k){
                maxLength=Math.max(maxLength, (j-i+1));
            }
            }
            
        }
         return maxLength;
        }
 public static int Hashmap(int arr[],int k)
    {
        int maxLength=0;
        HashMap <Integer,Integer> map=new HashMap<>();
        int sum=0;
        for(int i=0;i<arr.length;i++)
            {
            sum+=arr[i];
            if(sum==k)
            {
                 maxLength=i+1;
            }
            if(map.containsKey(sum-k))
            {
                 int len = i - map.get(sum-k);
                 maxLength=Math.max(maxLength, len);
            }
            if(!map.containsKey(sum))
            {
                 map.put(sum, i);
            }
            }
        return maxLength;
    }
       public static int slidingWindow(int arr[],int k){
        int left=0,right=0;
        int sum=arr[0];
       int  maxLength=0;
       while(right<arr.length){
        while(left<=right && sum>k){
            sum-=arr[left];
            left++;
        }
        if(sum==k){
            maxLength=Math.max(maxLength, right-left+1);
        }
        right++;
        if(right<arr.length){
            sum+=arr[right];
        }
       }
       return maxLength;
       }    

    public static void main(String[] args) {
        int arr[]={10,5,2,7,1,9};
     System.out.println(slidingWindow(arr, 15));
    }
}