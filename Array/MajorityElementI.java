package array;
import java.util.HashMap;

public class MajorityElementI {
    public static int bruteforce(int arr[]){
        for(int i=0;i<arr.length;i++){
            int count=0;
            for(int j=0;j<arr.length;j++){
                if(arr[j]==arr[i]){
                    count++;
                }
            }
            if(count>(arr.length)/2){
                return arr[i];
            }
        }
        return -1;
    }
   // Better Approach using HashMap
    public static int hashmapApproach(int arr[]){
        int n=arr.length;
       HashMap <Integer,Integer> map=new HashMap<>();
       for(int i=0;i<n;i++){
       map.put(arr[i],map.getOrDefault(arr[i], 0)+1);
       }
      for(Integer key : map.keySet()){
          if(map.get(key)>n/2){
            return key;
          }
      }
       
        return -1;
    }
    // Moore's voting Algorithm 
    public static int optimalSolution(int arr[]){
       int candidate=arr[0];
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(count==0){
          candidate=arr[i];
          count++;
            }
            else if(arr[i]==candidate){
                count++;
            }else{
                count--;
            }
        }
        int occurrence=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==candidate){
             occurrence++;
            }
        }
        if(occurrence>(arr.length)/2) return candidate;
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,1,1,2,2};
        System.out.println(hashmapApproach(arr));
    }
}
