import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumII {
     public  static  List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans =new ArrayList<>();
         if(candidates.length==0) return ans;
        Arrays.sort(candidates);
        findCombinationII(0,candidates,target,new ArrayList<>(),ans);
        return ans;
    }
    public static  void findCombinationI(int ind,int arr[],int target,List<Integer> list,List<List<Integer>> ans){
        if(ind>=arr.length){
            if(target==0 && !ans.contains(list)){
             ans.add(new ArrayList<>(list));
             return ;
            }else{
                return ;
            }
        }
        if(arr[ind]<=target){
            list.add(arr[ind]);
            findCombinationI(ind+1,arr,target-arr[ind],list,ans);
            list.removeLast();
        }
        findCombinationI(ind+1,arr,target,list,ans);

    }
     public static  void findCombinationII(int ind,int arr[],int target,List<Integer> list,List<List<Integer>> ans){
            if(target==0){
             ans.add(new ArrayList<>(list));
             return ;
            }
       for(int i=ind;i<arr.length;i++){
        if(i>ind && arr[i]== arr[i-1]) continue;
        if(arr[i]>target) break;
            list.add(arr[i]);
            findCombinationII(i+1,arr,target-arr[i],list,ans);
            list.removeLast();
       }
    }

    public static void main(String[] args){
        System.out.println(combinationSum2(new int[]{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}, 6));
    }
}
