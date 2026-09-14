import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetII {
     public static  void powerSet(int arr[],List<Integer> list, int ind,List<List<Integer>> ans){
    if(ind==arr.length){
        if(!ans.contains(list)){
            ans.add(new ArrayList<>(list));
            return ;
        }else{
            return;
        } 
    }
    list.add(arr[ind]);
    // take or pick particular index into the subsequence 
    powerSet(arr, list, ind+1,ans);
    list.remove(list.size()-1);
    // not pick condition , this element is not in your subsequence
    powerSet(arr, list, ind+1,ans);
    }
    public static  List<List<Integer>> subsetsWithDup(int[] nums) {
          List<List<Integer>> ans=new ArrayList<>();
          Arrays.sort(nums);
            powerSet(nums, new ArrayList<>(), 0, ans);
            return ans;
    }
    public static void main(String[] args) {
        int nums[]={4,4,4,1,4};
        System.out.println(subsetsWithDup(nums));
    }
}
