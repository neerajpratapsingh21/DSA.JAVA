import java.util.ArrayList;
import java.util.List;

public class PowerSet {
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
    public static void main(String[] args) {
        List<List<Integer>> ans=new ArrayList<>();
        int arr[]={3,1,2};
        powerSet(arr, new ArrayList<>(), 0, ans);
        System.out.println(ans.reversed());
    }
}
