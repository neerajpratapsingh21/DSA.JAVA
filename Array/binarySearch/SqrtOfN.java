package binarysearch;

public class SqrtOfN {
    public static int bruteForce(int n){
        for(int i=1;i<=n;i++){
            int sqrt=i*i;
            if(sqrt==n){
                return i;
            }else if(sqrt>n){
                return i-1;
            }
        }
        return 0;
    }
    public static int binarySearch(int n){
        int low=1;
        int high=n;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(mid*mid==n){
                return mid;
            }else if(mid*mid > n){
                high=mid-1;
            }else{
                low =mid +1;
            }
        }
        return high;
    }
    public static void main(String[] args) {
        
    }
}
