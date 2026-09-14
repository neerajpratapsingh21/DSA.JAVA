import java.util.ArrayList;
import java.util.List;

public class SubsetI {
      public static  void powerSet(int arr[],List<Integer> list, int ind,List<List<Integer>> ans){
    if(ind==arr.length){
    ans.add(new ArrayList<>(list));
    return;
    }
    list.add(arr[ind]);
    // take or pick particular index into the subsequence 
    powerSet(arr, list, ind+1,ans);
    list.remove(list.size()-1);
    // not pick condition , this element is not in your subsequence
    powerSet(arr, list, ind+1,ans);
    }
    public static List<List<Integer>> subsets(int[] nums) {
         List<List<Integer>> ans=new ArrayList<>();
         powerSet(nums,new ArrayList<>(),0,ans);
         return ans;
    }
    public static void main(String[] args) {
     int nums[]={3,1,20};
     System.out.println(subsets(nums));

}
}
