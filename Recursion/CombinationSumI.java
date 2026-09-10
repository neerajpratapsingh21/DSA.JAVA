import java.util.ArrayList;
import java.util.List;

/**
 * CombinationSumI
 */
public class CombinationSumI {
      public static  void subsequence(int arr[],List<Integer> list, int ind,List<List<Integer>> ans,int target){
    if(ind==arr.length){
    if(target==0){
    ans.add(new ArrayList<>(list));
    }
    return;
    }
    if(arr[ind]<=target){
    list.add(arr[ind]);
    // take or pick particular index into the subsequence 
    subsequence(arr, list, ind,ans,target-arr[ind]);
    list.remove(list.size()-1);
    }
    // not pick condition , this element is not in your subsequence
    subsequence(arr, list, ind+1,ans,target);
    }
    public static  List<List<Integer>> combinationSum(int[] arr, int target) {
    List<List<Integer>> ans= new ArrayList<>();     
    List<Integer> list=new ArrayList<>();
    subsequence(arr,list,0,ans,target);
    return ans;
    }  
public static void main(String[] args) {
    int arr[]={2,3,6,7};
    System.out.println(combinationSum(arr, 10));
}
    
}