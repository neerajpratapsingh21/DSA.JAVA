/**
 * LowerBound
 */
public class LowerBound {
  public static int bruteForce(int arr[],int x){
    for(int i=0;i<arr.length;i++){
        if(x<=arr[i]){
            return i;
        }
    }
    return arr.length;
  }
  public static int optimalSolution(int arr[],int x){
   int ans=arr.length;
   int low = 0;
   int high = arr.length-1;
   while(low<=high){
    int mid = (low + high)/2;
    if(arr[mid]>=x){
        ans=mid;
        high=mid-1;
    }else{
        low = mid +1;
    }
   }
   return ans;
  }
public static void main(String[] args) {
    int arr[]={1,2,3,5,46,94,2,13,};
    System.out.println(optimalSolution(arr,5 ));
}
    
}