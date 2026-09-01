package array;
import java.util.HashMap;

public class HighestOccurringElement {
    public static void fun(int arr[]){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }
       int maxFreq =Integer.MIN_VALUE;
       int maxelement = 0;
       int minfreq=Integer.MAX_VALUE;
       int minelement=0;

   for(Integer key : map.keySet()){

    if(map.get(key) > maxFreq){
        maxFreq = map.get(key);
        maxelement = key;
    }if(map.get(key)<minfreq){
        minfreq=map.get(key);
        minelement=key;
    }
    
}

System.out.println("Maximum occurrence number is :"+maxelement);
System.out.println("Minimum occurence number is :"+minelement);
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,2,1,1,3};
        fun(arr);
    }
}