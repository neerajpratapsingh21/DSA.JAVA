package array;
import java.util.HashMap;

public class LongestSubarrayWithZeroSum {
     public static int BetterApproach(int arr[]){
         int maxLength=0;
        for(int i=0;i<arr.length;i++){
             int sum=0;
        for(int j=i;j<arr.length;j++){
           sum+=arr[j];
           if(sum==0){
                maxLength=Math.max(maxLength, (j-i+1));
            }
            }
            
        }
         return maxLength;
        }
        public static int Hashmap(int arr[])
    {
        int maxLength=0;
        HashMap <Integer,Integer> map=new HashMap<>();
        int sum=0;
        for(int i=0;i<arr.length;i++)
            {
            sum+=arr[i];
            if(sum==0)
            {
                 maxLength=i+1;
            }
            if(map.containsKey(sum))
            {
                 int len = i - map.get(sum);
                 maxLength=Math.max(maxLength, len);
            }
            if(!map.containsKey(sum))
            {
                 map.put(sum, i);
            }
            }
        return maxLength;
    }
    public static void main(String[] args) {
        int arr[]={9,-3,3,-1,6,-5};
System.out.println(Hashmap(arr));
    }
}
