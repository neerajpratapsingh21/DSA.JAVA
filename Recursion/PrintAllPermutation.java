import java.util.ArrayList;
import java.util.List;

public class PrintAllPermutation {
    
    public static List<List<Integer>> printPermutation(int arr[]){
        List<List<Integer>> ans=new ArrayList<>();
       // boolean map[]=new boolean[arr.length];
       // recursivePermutation(arr,new ArrayList<>(),ans,map);
permutation(arr, 0, ans);
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
    public static  void permutation(int arr[],int ind, List<List<Integer>> ans){
       if(ind == arr.length){
    List<Integer> temp = new ArrayList<>();

    for(int x : arr){
        temp.add(x);
    }

    ans.add(temp);
    return;
}
        for(int i=ind; i<arr.length;i++){
         swap(ind, i, arr);

         permutation(arr, ind+1, ans);
         swap(ind, i, arr);
        }
    }
    public static void swap(int left,int right,int arr[]){
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
    }
    public static void main(String[] args) {
        int arr[]={3,1,2};
        System.out.println(printPermutation(arr));
    }
}
