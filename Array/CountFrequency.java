package array;
import java.util.HashMap;

public class CountFrequency {
    public static void count(int arr[],int n){
        HashMap<Integer,Integer> map = new HashMap<>();

for(int i=0;i<arr.length;i++){
   map.put(arr[i],map.getOrDefault(arr[i], 0)+1);
}
System.out.println(map.getOrDefault(n,0));
    
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,1,2};
        count(arr, 0);
    }

}