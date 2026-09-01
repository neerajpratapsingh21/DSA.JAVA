package array.binarySearch;

public class SmallestDivisor {
    public static int bruteForce(int arr[],int threshold)
    {
         if(arr.length>threshold) return -1;
        int max=Integer.MIN_VALUE;
        for(int i : arr){
            max=Math.max(max, i);
        }
        for(int d=1;d<=max;d++){
            int sum=0;
            for(int i=0;i<arr.length;i++){
                sum+=(arr[i]+d-1)/d;
            }
            if(sum<=threshold){
                return d;
            }
        }
        return -1;
    }
     public static int optimalSolution(int arr[],int threshold)
    {
        if(arr.length>threshold) return -1;
        int max=Integer.MIN_VALUE;
        for(int i : arr){
            max=Math.max(max, i);
        }
      int low =1;
      int high=max;
      while(low<=high){
        int mid = low + (high-low)/2;
            int sum=0;
            for(int i=0;i<arr.length;i++){
                sum+=(arr[i]+mid-1)/mid;
            }
            if(sum<=threshold){
             high=mid-1;
            }else{
                low =mid+1;
            }
        }
        return low;
    }
    public static void main(String[] args) {
        int arr[]={1,2,5,9};
        System.out.println(optimalSolution(arr, 6));
        System.out.println(bruteForce(arr, 6));
    }
}
