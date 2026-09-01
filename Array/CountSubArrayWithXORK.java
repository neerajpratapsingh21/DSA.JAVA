package array;
import java.util.HashMap;

/**
 * CountSubArrayWithXORK
 */
public class CountSubArrayWithXORK {
public static int bruteForce(int nums[],int k){
    int count = 0;
    for(int i=0;i<nums.length;i++){
        int xor=0;
        for(int j=i;j<nums.length;j++){
            xor=xor^nums[j];
            if(xor==k){
                count++;
            }
        }
    }
    return count;
}
public static int optimalApproach(int nums[],int k ){
    HashMap <Integer,Integer> map=new HashMap<>();
    map.put(0, 1);
    int xor=0;
    int count=0;
    for(int i :nums){
        xor=xor^i;
        int required=k^xor;
        if(map.containsKey(required)){
            count += map.get(required);
        }
            map.put(xor, map.getOrDefault(xor, 0)+1);
        
    }
    return count;

}
    public static void main(String[] args) {
        int nums[]={4,2,2,6,4};
        System.out.println(bruteForce(nums, 6));
        System.out.println(optimalApproach(nums, 6));
    }
}