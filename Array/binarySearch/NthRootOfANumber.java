package binarysearch;

public class NthRootOfANumber {
    public static int bruteForce(int n,int m){
        // Loop from 1 to m
        for (int i = 1; i <= m; i++) {
            // Compute i^n
            long power = (long) Math.pow(i, n);

            // If equal to m, return i
            if (power == m) return i;

            // If exceeds m, break
            if (power > m) break;
        }

        // If not found, return -1
        return -1;
    }
    public static int binarySearch(int n, int m){
        int low =1 ,high=m;
        while(low<=high){
            int mid=low +(high-low)/2;
            long power = (long) Math.pow(mid, n);
            if(power==m){
                return mid;
            }else if(power>m){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(binarySearch(3, 26));
    }
}
