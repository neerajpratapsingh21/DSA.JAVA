package mocks;

import java.util.HashMap;

public class LongestSubarraywithSumK {
    public static  int longestSubArray(int arr[],int k){
        int maxlen=0;
        int curr=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
       curr+=arr[i]; 
       if(curr==k){
      maxlen=Math.max(maxlen,i+1);

       } 
       int req=curr-k;
       if(map.containsKey(req)){
        int len=i-map.get(req);
        maxlen=Math.max(maxlen, len);
       }
       map.put(curr, map.getOrDefault(curr, i));
        }
        return  maxlen;
    }
    public static void main(String[] args) {
        int arr[]={1,-1,4,-2,3,8};
        System.out.println(longestSubArray(arr, 4));
    }
}
