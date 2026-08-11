package binarysearch;

public class AllocateBooks {
    public static int findMin(int pages[]){
        int min=Integer.MAX_VALUE;
        for(int i : pages){
            min=Math.min(i, min);
        }
        return min;
    }
     public static int calculateTotalPages(int pages[]){
        int sum=0;
        for(int i : pages){
            sum+=i;
        }
        return sum;
    }
    public static int bruteForce(int arr[],int students ){
        if(students>arr.length) return -1;
        int low=findMin(arr);
        int high=calculateTotalPages(arr);
        for(int i=low;i<=high;i++){
          if(isPossible(arr, i, students)) return i;
        }
        return -1;
    }
    public static boolean isPossible(int pages[],int maxPage,int students){

     int allocatedStudent = 1;
     long currentPages=0;
     for(int i=0;i<pages.length;i++){
        if(pages[i]>maxPage) return false;
        if(pages[i]+currentPages>maxPage){
             allocatedStudent++;
             currentPages=pages[i];
        }else{
            currentPages+=pages[i];
        }
     }
     if(allocatedStudent>students){
        return false;
     }else{
        return true;
     }
    }
    public static int optimalSolution(int pages[],int students ){
        if(students>pages.length) return -1;
        int ans=-1;
        int low=findMin(pages);
        int high=calculateTotalPages(pages);
        while(low<=high){
            int mid =low +(high-low)/2;
            if(isPossible(pages, mid, students)){
                   ans=mid;
                   high=mid-1;
            }else{
                low = mid + 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int pages[]={12,34,67,90};
        System.out.println(bruteForce(pages, 2));
    }
}
