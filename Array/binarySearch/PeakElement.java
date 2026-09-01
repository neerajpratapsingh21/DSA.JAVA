package array.binarySearch;

public class PeakElement {
    public static int bruteForce(int arr[]){
          for(int i=0;i<arr.length;i++){
            if((i==0 || arr[i-1]<arr[i])&& (i==arr.length-1 || arr[i+1]<arr[i])){
                return i;
            }
        }
        return -1;
    }
    public static int optimalSolution(int arr[]){
        int n=arr.length;
        if(n==1)return 0;
        if(arr[0]>arr[1]) return 0;
        if(arr[n-1]>arr[n-2]) return n-1;
        int low =1;
        int high=arr.length-2;
        while(low<=high){
            int mid = low +(high-low)/2;
            if(arr[mid-1]<arr[mid] &&  arr[mid+1]<arr[mid]){
                return mid;
            }else if(arr[mid]<arr[mid+1]){
                low=mid +1;
            }else{
                high = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,10,13,7};
        System.out.println(optimalSolution(arr));
        
    }
}
