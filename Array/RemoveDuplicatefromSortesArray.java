package array;
import java.util.HashSet;


public class RemoveDuplicatefromSortesArray {
    

    public static int removeDuplicates(int[] nums) {
        int i=0;
        for(int j=1;j<nums.length;j++){
            if(nums[j]!=nums[i]){
                nums[i+1]=nums[j];
                i++;
            }
        }
        return (i+1);
    }
    public static int removeDuplicatesbyset(int nums[]){
     HashSet <Integer> set=new HashSet<>();
     for(int i=0;i<nums.length;i++){
        set.add(nums[i]);
     }
     int index=0;
     for(int it:set){
    nums[index]=it;
    index ++;
     }
     return index;

    }

    public static void main(String[] args) {
        int nums[]={1,1,2};
        int k=removeDuplicatesbyset(nums);
        for(int i=0;i<k;i++){
            System.out.print(nums[i]+"  ");
        }
    }
}
