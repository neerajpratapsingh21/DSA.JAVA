import java.util.ArrayList;
import java.util.List;

public class PrintAllPermutation {
    
    public static List<List<Integer>> printPermutation(int arr[]){
        List<List<Integer>> ans=new ArrayList<>();
        boolean map[]=new boolean[arr.length];
        recursivePermutation(arr,new ArrayList<>(),ans,map);
        return  ans;
    }
    public static void recursivePermutation(int[] arr, List<Integer> list, List<List<Integer>> ans, boolean[] map) {
        if(list.size()==map.length){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i=0;i<arr.length;i++){
            if(!map[i]){
                list.add(arr[i]);
                map[i]=true;
                recursivePermutation(arr, list, ans, map);
                list.removeLast();
                map[i]=false;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={3,1,2};
        System.out.println(printPermutation(arr));
    }
}
